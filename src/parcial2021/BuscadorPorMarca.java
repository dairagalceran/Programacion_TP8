package parcial2021;

public class BuscadorPorMarca  extends Buscador{

    private String marca;

    public BuscadorPorMarca(String marca){
        this.marca = marca;
    }

    @Override
    public  boolean esCumplidaPor(ElementoVenta el){
        return el.getMarca().equalsIgnoreCase(this.marca);
    }   
}
