package  prefinal2021;

public class BusquedaPorURL extends CondicionBusqueda{
    
    private String url;

    public BusquedaPorURL(String url){
        this.url = url;
    }

    public boolean esCumplidaPor(Marcador mcd){
        return mcd.getUrl().contains(this.url);
    }
}
