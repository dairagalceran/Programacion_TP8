package parcial2021_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import parcial2021_2.condicionesBusqueda.CondicionBusqueda;

public class EmpresaAlquiler {
    
    private ArrayList<ElementoAlquiler> alquileres;

    public EmpresaAlquiler(){
        this.alquileres = new ArrayList<>();
    }

    public ArrayList<ElementoAlquiler> getAlquileres() {
        ArrayList<ElementoAlquiler> salida =  new ArrayList<ElementoAlquiler>();
        salida.addAll(alquileres);
        Collections.sort(salida);
        return salida;
    }

    public void  addAlquiler(ElementoAlquiler el){
        alquileres.add(el);
    }

    public ArrayList<ElementoAlquiler> buscarPor(CondicionBusqueda cond){
        ArrayList<ElementoAlquiler> salida = new ArrayList<>();
        for(int i = 0; i< alquileres.size(); i++){
            if(cond.esCumpliaPor(alquileres.get(i))){
                salida.add(alquileres.get(i));
            }
        }
        Collections.sort(salida);
        return salida;
    }

}
