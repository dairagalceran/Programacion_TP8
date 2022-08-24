package tp8_ej1_Futbol5;

public class CondicionBusquedaNOT extends CondicionBusqueda {
    
    private CondicionBusqueda cond1;

    public CondicionBusquedaNOT(CondicionBusqueda cond1){
        this.cond1 = cond1;
    }

    @Override
    public boolean esCumplidaPor(Socio sc){
        return !cond1.esCumplidaPor(sc);
    }
}
