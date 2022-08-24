package parcial2022_comparator;

public class BusquedaPorMarca  extends CondicionBusqueda{
    private String marca;

    public BusquedaPorMarca(String marca){
        this.marca =marca;
    }

    @Override
    public boolean esCumplidaPor(ElementoAdmin el){
        return el.getMarca().equalsIgnoreCase(this.marca);
    }
}
