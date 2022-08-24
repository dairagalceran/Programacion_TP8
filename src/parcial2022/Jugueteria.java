package parcial2022;
import java.util.ArrayList;
import java.util.Collections;

public class Jugueteria {
    
    private ArrayList<ElementoAdmin> productos; //puede ser simple o compuesto

    public Jugueteria(){
        this.productos = new ArrayList<>();
    }

    public  void  addProductos(ElementoAdmin el){
        if(!productos.contains(el)){
            productos.add(el);
        }
    }

    public ArrayList<ElementoAdmin> getProductos(){
        ArrayList<ElementoAdmin> salida = new ArrayList<ElementoAdmin>();
        salida.addAll(productos);
        Collections.sort(salida);
        return salida;
    }

    
    //____ Busqueda profunda-----
    public ArrayList<ElementoAdmin>  buscarPor(CondicionBusqueda cond){
        ArrayList<ElementoAdmin> salida = new ArrayList<ElementoAdmin>();
        for(int i =0; i< productos.size(); i++){
            salida.addAll(productos.get(i).buscarPor(cond));
        }
        Collections.sort(salida);
        return salida;
    }

    //------APLANADA------
    /* 
    public ArrayList<ElementoAdmin> buscarPor(CondicionBusqueda cond){
        ArrayList<ElementoAdmin> salida = new ArrayList<>();
        for(int i =0; i < productos.size(); i++){
            ElementoAdmin aux = productos.get(i);        
            if (cond.esCumplidaPor(aux)){
                salida.add(aux);
            }
        }
        Collections.sort(salida);
        return salida;
    }*/



}
