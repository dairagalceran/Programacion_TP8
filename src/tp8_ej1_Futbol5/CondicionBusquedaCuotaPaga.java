package tp8_ej1_Futbol5;

public class CondicionBusquedaCuotaPaga  extends CondicionBusqueda{
    
    private boolean ultimaCuota;

    public CondicionBusquedaCuotaPaga(boolean ultimaCuota){
        this.ultimaCuota = ultimaCuota;
    }

    @Override
    public boolean esCumplidaPor(Socio sc){
        return this.ultimaCuota  == sc.estaAlDia();
    }
}
