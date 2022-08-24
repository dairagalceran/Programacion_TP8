package parcial2022;
import java.util.ArrayList;

public abstract class ElementoAdmin  implements Comparable<ElementoAdmin>{
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

        //-----se puede implementar acá porque hay que ordenar primero por marca 
        //osea a mi con la marca que vino
    @Override
    public int compareTo(ElementoAdmin el){
        int result = marca.compareTo(el.getMarca());
        if(result == 0){
            //al ser double hay que comparar
            double elCosto = el.getCosto();
            double miCosto = this.getCosto();
            if(miCosto > elCosto ){
                return 1;
            }else if(miCosto < elCosto){
                return -1;
            }else{
                result = this.getCantidadEncastre() - el.getCantidadEncastre();
                if(result == 0){
                    result = this.getColor().compareTo(el.getColor());
                    return result;
                }
                else{
                    return result;
                }          
            }
        }else{
            return result;
        }
    }
    
    @Override
    public String toString(){
        return  "Ladrillo/Combo/Paquete marca: "+this.getMarca();
    }
    
}
