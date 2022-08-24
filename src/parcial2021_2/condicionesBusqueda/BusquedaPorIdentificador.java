package parcial2021_2.condicionesBusqueda;
import parcial2021_2.Articulo;
import parcial2021_2.ElementoAlquiler;

public class BusquedaPorIdentificador extends CondicionBusqueda{
    private int idBuscado;

    public BusquedaPorIdentificador(int idBuscado){
        this.idBuscado = idBuscado;
    }

    public boolean esCumpliaPor(ElementoAlquiler art){
        return art.getId() == this.idBuscado;
    }
}
