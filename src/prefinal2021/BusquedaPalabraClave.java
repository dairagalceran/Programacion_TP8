package prefinal2021;

public class BusquedaPalabraClave extends CondicionBusqueda{
    private String buscarPalabra;

    public BusquedaPalabraClave(String buscarPalabra){
        this.buscarPalabra = buscarPalabra;
    }

    public boolean esCumplidaPor(Marcador mcd){
        return mcd.tienePalabraClave(this.buscarPalabra);
    }
}
