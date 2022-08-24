package tp8_ej1_Futbol5;

public class CondicionBusquedaPagoMayorA  extends CondicionBusqueda{
    private double pago;

    public CondicionBusquedaPagoMayorA(double pago){
        this.pago = pago;
    }

    @Override
    public boolean esCumplidaPor(Socio sc){
        return sc.pagoMasDe(pago);
    }
}
