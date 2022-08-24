package parcial2022_comparator;

public class BusquedaPorColor  extends CondicionBusqueda{
    private String color;

    public BusquedaPorColor(String color){
        this.color = color;
    }

    @Override
    public boolean esCumplidaPor(ElementoAdmin el){
        return el.getColor().equals(this.color);
    }
    
}
