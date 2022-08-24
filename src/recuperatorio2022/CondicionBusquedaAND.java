package recuperatorio2022;

public class CondicionBusquedaAND extends Condicionbusqueda{
    private Condicionbusqueda cond1;
    private Condicionbusqueda cond2;
    
    public CondicionBusquedaAND(Condicionbusqueda cond1 , Condicionbusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    public boolean esCumplidaPor(ElementoAutoparte el){
        return cond1.esCumplidaPor(el) && cond2.esCumplidaPor(el);
    }
}
