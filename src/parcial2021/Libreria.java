package parcial2021;

import java.util.ArrayList;


public class Libreria {
    
    private String nombre;
    private ArrayList<ElementoVenta> productos;
    private Buscador politicaPublicidad;

    public Libreria(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.politicaPublicidad = politicaPublicidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addProductos(ElementoVenta el){
        if(!productos.contains(el)){
            productos.add(el);
        }
    }

    public boolean saleEnDiario(ElementoVenta el){
        return politicaPublicidad.esCumplidaPor(el);
    }

    public Buscador getPoliticaPublicidad() {
        return politicaPublicidad;
    }
    
    public void setPoliticaPublicidad(Buscador condicion) {
        this.politicaPublicidad = condicion;
    }

    public ArrayList<ElementoVenta> buscarPor(Buscador condicion){
        ArrayList<ElementoVenta> aux = new ArrayList<>();
        for (int i =0; i < productos.size(); i++){
            ElementoVenta prod = productos.get(i);
                aux.addAll(prod.buscarPor(condicion));
            } 
            return aux;  
    }
}

