package tp8_ej1_Futbol5;

public class CondicionBusquedaCancha extends CondicionBusqueda{

    private int idCancha;

    public CondicionBusquedaCancha(int idCancha){
        this.idCancha = idCancha;
    }

    @Override
    public boolean esCumplidaPor(Socio sc){
        return  sc.alquiloCancha(idCancha);
    }   
}
