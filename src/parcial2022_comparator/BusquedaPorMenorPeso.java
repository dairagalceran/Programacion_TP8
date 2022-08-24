package parcial2022_comparator;
public class BusquedaPorMenorPeso extends CondicionBusqueda{

    private double peso;

    public BusquedaPorMenorPeso(double peso){
        this.peso = peso;
    }

    @Override
    public boolean esCumplidaPor(ElementoAdmin el){
        return el.getPeso() < this.peso;
    }
    
}
