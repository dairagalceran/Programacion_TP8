package recuperatorio2022;

public class BuscarPorMarca extends Condicionbusqueda{

    private String marca;

    public BuscarPorMarca(String marca){
        this.marca = marca;
    }
    
    public  boolean esCumplidaPor(ElementoAutoparte el){
        return el.getMarca().equals(this.marca);
    }

}
