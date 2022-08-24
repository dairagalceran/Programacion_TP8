package parcial2021;

public class BuscadorPorMayorPrecio extends Buscador{
    
    private double precio;

    public BuscadorPorMayorPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public boolean esCumplidaPor(ElementoVenta prod){
        return prod.getPrecio()  > precio;
    }

}
