package tp8_ej1_Futbol5;

public class CondicionBusquedaAND extends CondicionBusqueda{
    
    private CondicionBusqueda cond1;
    private CondicionBusqueda cond2;

    public CondicionBusquedaAND(CondicionBusqueda cond1, CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean esCumplidaPor(Socio sc){
        return this.cond1.esCumplidaPor(sc) && this.cond2.esCumplidaPor(sc);
    }
}
