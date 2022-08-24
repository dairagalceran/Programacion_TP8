package prefinal2021;

public class BusquedaNOT extends CondicionBusqueda{
    
    private CondicionBusqueda cond;

    public BusquedaNOT(CondicionBusqueda cond){
        this.cond = cond;
    }

    public boolean esCumplidaPor(Marcador mcd){
        return  !this.cond.esCumplidaPor(mcd);
    }
}
