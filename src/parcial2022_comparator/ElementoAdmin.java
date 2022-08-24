package parcial2022_comparator;
import java.util.ArrayList;

public abstract class ElementoAdmin  {
    private String marca;


    public ElementoAdmin(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public abstract double getPeso();
    public abstract String getColor();
    public abstract int getCantidadEncastre();
    public abstract double getCosto();
    public abstract ArrayList<ElementoAdmin>  buscarPor(CondicionBusqueda cond);
    public abstract ElementoAdmin getCopia();
    
    @Override
    public String toString(){
        return  "Ladrillo/Combo/Paquete marca: "+this.getMarca();
    }
    
}
