package parcial2021_2.condicionesBusqueda;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class BusquedaValorMenorA  extends CondicionBusqueda{
    
    private double limiteValor;

    public BusquedaValorMenorA(double limiteAnt){
        this.limiteValor = limiteValor;
    }

    public boolean esCumpliaPor(ElementoAlquiler art){
        return art.getValor() < this.limiteValor;
    }
}
