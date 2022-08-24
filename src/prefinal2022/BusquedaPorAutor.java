package prefinal2022;

public class BusquedaPorAutor extends CondicionBusqueda{

    private String autor;

    public BusquedaPorAutor(String autor){
        this.autor = autor;
    }

    public  boolean esCumplidaPor(Noticia noti){
        return noti.getAutor().contains(this.autor);
    }        
    
}
