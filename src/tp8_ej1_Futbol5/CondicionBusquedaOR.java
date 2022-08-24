package tp8_ej1_Futbol5;

public class CondicionBusquedaOR extends CondicionBusqueda{
   
    private CondicionBusqueda cond1, cond2;

    public CondicionBusquedaOR(CondicionBusqueda cond1, CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }
    
    @Override
    public boolean esCumplidaPor(Socio sc){
        return this.cond1.esCumplidaPor(sc) || this.cond2.esCumplidaPor(sc);
    }
}
