package parcial2022_comparator;

public class BusquedaPorMenorCantidadEncastre  extends CondicionBusqueda{

    private int cantEncastr;

    public BusquedaPorMenorCantidadEncastre(int cantEncastr){
        this.cantEncastr = cantEncastr;
    }

    @Override
    public boolean esCumplidaPor(ElementoAdmin el){
        return el.getCantidadEncastre() < (this.cantEncastr);
    }
    
}

