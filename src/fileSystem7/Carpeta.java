package fileSystem7;

import fileSystem7.Archivo;
import fileSystem7.condiciones.Condicion;
import java.util.ArrayList;


public class Carpeta extends ElementoFS{
    private ArrayList<ElementoFS> elementos;

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
        String retorno = "\n"+this.getNombre()+"{";
        int i = 0;
        while (i < elementos.size()) {
            retorno+=elementos.get(i).toString();
            if (i!=elementos.size()-1)
                retorno+=";";
            i++;
        }
        return retorno+"}";
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion){
        ArrayList<Archivo> resultado = new ArrayList<>();
        for (ElementoFS hijo:this.elementos){
            resultado.addAll(hijo.buscar(condicion));
        }
        return resultado;
    }

}
