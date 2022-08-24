package parcial2021_2.calculadorAlquiler;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class CalcularCostoMixto {
    private CalculadorAlquiler costoAlq1;
    private CalculadorAlquiler costoAlq2;

    public CalcularCostoMixto(CalculadorAlquiler costoAlq1, CalculadorAlquiler costoAlq2){
        this.costoAlq1 = costoAlq1;
        this.costoAlq2 = costoAlq2;
    }

    public double calcularCostoAlquiler(ElementoAlquiler el){
        return costoAlq1.calcularCostoAlquiler(el) + costoAlq2.calcularCostoAlquiler(el);
    }

}
