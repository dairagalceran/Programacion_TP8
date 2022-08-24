package tp8_ej1_Futbol5;

public class CondicionBusquedaEdadMayorA extends CondicionBusqueda{

    private int edad;
    public CondicionBusquedaEdadMayorA(int edad){
        this.edad = edad;
    }

    @Override
    public boolean esCumplidaPor(Socio sc){
        return  sc.getEdad() >= this.edad;
    }

    
}
