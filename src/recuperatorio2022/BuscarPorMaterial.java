package recuperatorio2022;

public class BuscarPorMaterial extends Condicionbusqueda{
    
    private String material;

    public BuscarPorMaterial(String material){
        this.material = material;
    }

    public boolean esCumplidaPor(ElementoAutoparte el){
        return el.getMateriales().contains(this.material);
    }
}
