package fileSystemCopia;
import java.util.ArrayList;
import fileSystemCopia.condiciones.*;
import java.util.ArrayList;

public class Carpeta extends ElementoFS{
    protected ArrayList<ElementoFS> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoFS elem){
        if (!elementos.contains(elem))
            elementos.add(elem);
    }

    public void eliminarElemento(ElementoFS elem){
        elementos.remove(elem); //NO OLVIDARME DEL EQUALS
    }

    @Override
    public int cantidadArchivos(){
        //return archivos.size();//SOLO 1 NIVEL
        int cant = 0;
        for(ElementoFS e:elementos){
            cant += e.cantidadArchivos();
        }
        return cant;
    }

    @Override
    public double getTamanio(){
        double total = 0.0;
        for(ElementoFS e:elementos){
            total += e.getTamanio();
        }
        return total;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Carpeta otro = (Carpeta) o; //Esto puede fallar si me quieren comparar una carpeta con un comprimido con los mismos nombres
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        String retorno = this.getNombre();/*+"{";
        int i = 0;
        while (i < elementos.size()) {
            retorno+=elementos.get(i).toString();
            if (i!=elementos.size()-1)
                retorno+=";";
            i++;
        }*/
        return retorno;//+"}";
    }
    @Override

    public ArrayList<Archivo> buscar(Condicion condicion){
        ArrayList<Archivo> resultado = new ArrayList<>();
        for (ElementoFS hijo:this.elementos){
            resultado.addAll(hijo.buscar(condicion));
        }
        return resultado;
    }
    
	@Override
	public String imprimir(String pref) {
		String aux = pref + this.toString();
		for (int i = 0; i < this.elementos.size(); i++)
			aux = aux + "\n" + this.elementos.get(i).imprimir(pref + pref.charAt(0));
		return aux;
	}
	
	protected Carpeta instanciar() {
		return new Carpeta(this.getNombre());
	}

	@Override
	public ElementoFS getCopia() {
		//Carpeta copia = new Carpeta(this.getNombre());
		Carpeta copia = this.instanciar();
		// No copiamos la fecha de modificacion y creacion
		
		for (int i = 0; i < this.elementos.size(); i++)
			//copia.agregarElemento(this.elementos.get(i)); // Esto no copia en profundidad!
			copia.agregarElemento(this.elementos.get(i).getCopia());
			
		return copia;
	}
	
	@Override
	public ElementoFS getCopiaRestringida(Condicion condicion) {
		
		ArrayList<ElementoFS> hijos_que_cumplen = new ArrayList<>();;
		for (int i = 0; i < this.elementos.size(); i++) {
			ElementoFS ei = this.elementos.get(i);
			ElementoFS copia_ei = ei.getCopiaRestringida(condicion); // Puede ser un elemento o null
			if (copia_ei != null)
				hijos_que_cumplen.add(copia_ei);
		}
		
		// Me fijo si tengo hijos que cumplen
		if (hijos_que_cumplen.isEmpty()) {
			if (condicion.cumple(this)) { // Retorno la carpeta si cumple, pero sin hijos
				Carpeta copia = this.instanciar();
				return copia;
			}
			else
				return null;
		}
		else {
			// Crear efectivamente la copia de la carpeta
			Carpeta copia = this.instanciar();
			for (int j = 0; j < hijos_que_cumplen.size(); j++)
				copia.agregarElemento(hijos_que_cumplen.get(j));
			return copia;
		}
	}
	/*public ElementoFS getCopiaRestringida(Condicion condicion) {    // Version ORIGINAL CON CONDICION SOBRE ARCHIVO
		
		// Recorrer los hijos y ver si alguno cumple
		ArrayList<ElementoFS> hijos_que_cumplen = new ArrayList<>();;
		for (int i = 0; i < this.elementos.size(); i++) {
			ElementoFS ei = this.elementos.get(i);
			ElementoFS copia_ei = ei.getCopiaRestringida(condicion); // Puede ser un elemento o null
			if (copia_ei != null)
				hijos_que_cumplen.add(copia_ei);
		}
		
		// Me fijo si tengo hijos que cumplen
		if (hijos_que_cumplen.isEmpty()) {
			return null;
		}
		else {
			// Crear efectivamente la copia de la carpeta
			Carpeta copia = this.instanciar();
			for (int j = 0; j < hijos_que_cumplen.size(); j++)
				copia.agregarElemento(hijos_que_cumplen.get(j));
			return copia;
		}
	}*/



}
