package parcial2021_2.condicionesBusqueda;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class BusquedaAND extends CondicionBusqueda {

    private CondicionBusqueda cond1;
    private CondicionBusqueda cond2;

    public BusquedaAND(CondicionBusqueda cond1, CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    public boolean esCumpliaPor(ElementoAlquiler art){
        return cond1.esCumpliaPor(art) && cond2.esCumpliaPor(art);
    }
}
