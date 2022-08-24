package parcial2022_comparator;
import java.util.Comparator;

public class OrdenCantidadEncastre implements Comparator<ElementoAdmin>{
   

    @Override
    public int compare(ElementoAdmin el1, ElementoAdmin el2){
        return el1.getCantidadEncastre() - (el2.getCantidadEncastre());
    }
}
