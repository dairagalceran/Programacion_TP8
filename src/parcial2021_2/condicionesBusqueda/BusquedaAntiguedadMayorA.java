package parcial2021_2.condicionesBusqueda;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class BusquedaAntiguedadMayorA  extends CondicionBusqueda{

    private int limiteAnt;

    public BusquedaAntiguedadMayorA(int limiteAnt){
        this.limiteAnt = limiteAnt;
    }
    
    public boolean esCumpliaPor(ElementoAlquiler art){
        return art.getAntiguedad()> this.limiteAnt;
    }
}
