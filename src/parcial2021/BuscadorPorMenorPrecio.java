package parcial2021;

public class BuscadorPorMenorPrecio  extends Buscador{
    private double precio;

    public BuscadorPorMenorPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public boolean esCumplidaPor(ElementoVenta prod){
        return prod.getPrecio() < precio;
    }

}
