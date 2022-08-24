package parcial2021_2.calculadorAlquiler;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class CalcularCostoConPorcentaje extends CalculadorAlquiler{
    
    private double porcentajeValor;

    public CalcularCostoConPorcentaje(double porcentajeValor){
        this.porcentajeValor = porcentajeValor;
    }

    public double calcularCostoAlquiler(ElementoAlquiler el){
        return  el.getValor() * this.porcentajeValor/100;
    }
}

