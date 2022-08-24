package parcial2021_2.calculadorAlquiler;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class CalcularCostoFijo extends CalculadorAlquiler{
    
    private double costoFijo;

    public CalcularCostoFijo(double costoFijo){
        this.costoFijo = costoFijo;
    }

    public double calcularCostoAlquiler(ElementoAlquiler el){
        return this.costoFijo;
    }
}
