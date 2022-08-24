package prefinal2021;

import java.util.ArrayList;

public class Categoria extends ElementoAdministrador{

    private ArrayList<ElementoAdministrador> elementos;
    private String categoriaNombre, descripcion;

    public Categoria(String categoriaNombre){
        this.categoriaNombre = categoriaNombre;
        this.descripcion = null;
        this.elementos = new ArrayList<>();
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public ArrayList<ElementoAdministrador> getElementos() {
        return new ArrayList<ElementoAdministrador>(elementos);
    }

    public void addElementos(ElementoAdministrador el){
        if(!elementos.contains(el))
        elementos.add(el);
    }

    public int contarCantidadMarcadores(){
        int contar =0;
        for(int i =0; i < elementos.size(); i ++){
            contar += elementos.get(i).contarCantidadMarcadores();
        }
        return contar;
    }

    public  ArrayList<String> getPalabrasClaves(){
        ArrayList<String> palabrasSinRepetidos = new ArrayList<>();
        for (int i = 0; i<elementos.size(); i++){
            ArrayList<String> todas = elementos.get(i).getPalabrasClaves();
            for(int j =0; j< todas.size(); j++){
                if(!palabrasSinRepetidos.contains(todas.get(j))){
                    palabrasSinRepetidos.add(todas.get(j));
                }
            }
        }
        return palabrasSinRepetidos;
    }
    /* 
    public  int cantidadPalabrasClaves(){
        int contar = 0;
        for(int i =0; i < elementos.size(); i ++){
            contar += elementos.get(i).cantidadPalabrasClaves();
        }
        return contar;
    }
*/
    public ArrayList<Marcador> buscarPor(CondicionBusqueda cond){
        ArrayList<Marcador> salida = new ArrayList<>();
        for(int i =0; i < elementos.size(); i ++){
            salida.addAll(elementos.get(i).buscarPor(cond));
        }
        return salida;
    }


    public Categoria instanciar(){
        return new Categoria(this.getCategoriaNombre());
    }
    @Override
    public  ElementoAdministrador getCopia(){
        Categoria copia = this.instanciar();
        for(int i = 0; i < elementos.size(); i++){
            copia.addElementos(this.elementos.get(i).getCopia());
        }
        return copia;
    }

    @Override
    public ElementoAdministrador getCopiaRestringida(CondicionBusqueda cond){
        ArrayList<ElementoAdministrador> elementosQueCumplen = new ArrayList<>();
        for(int i = 0; i <elementos.size();i++){
            ElementoAdministrador ei = elementos.get(i);
            ElementoAdministrador copia_ei = ei.getCopiaRestringida(cond);
            if(copia_ei != null){
                elementosQueCumplen.add(copia_ei);
            }
        }
        if(!elementosQueCumplen.isEmpty()){
            Categoria copia = this.instanciar();
            for(int j =0; j< elementosQueCumplen.size(); j++){
                copia.addElementos(elementosQueCumplen.get(j));
            }   
            return copia; 
        }else{
            return null;
        }
    }

    @Override
	public String imprimir(String pref) {
		String aux = pref + this.toString();
		for (int i = 0; i < this.elementos.size(); i++)
			aux = aux + "\n" + this.elementos.get(i).imprimir(pref + pref.charAt(0));
		return aux;
	}
	
    public String toString(){
        return "Categoria: "+this.getCategoriaNombre()+" \n";
    }

}
