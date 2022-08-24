package parcial2021_2.condicionesBusqueda;

import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class BusquedaContienePalabraEnDescripcion extends CondicionBusqueda{

    private String palabra;

    public BusquedaContienePalabraEnDescripcion(String palabra){
        this.palabra = palabra;
    }

    public boolean esCumpliaPor(ElementoAlquiler el){
        return   el.getDescripcion().contains(this.palabra);
    }


    
}
