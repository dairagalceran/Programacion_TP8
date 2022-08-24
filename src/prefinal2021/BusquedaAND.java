package prefinal2021;

public class BusquedaAND  extends CondicionBusqueda{
    private CondicionBusqueda cond1, cond2;

    public BusquedaAND(CondicionBusqueda cond1, CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    public boolean esCumplidaPor(Marcador mcd){
        return cond1.esCumplidaPor(mcd) && cond2.esCumplidaPor(mcd);
    }
}
