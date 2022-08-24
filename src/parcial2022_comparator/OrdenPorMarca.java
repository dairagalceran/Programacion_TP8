package parcial2022_comparator;
import java.util.Comparator;

public class OrdenPorMarca  implements Comparator<ElementoAdmin>{
    
    @Override
    public int compare(ElementoAdmin el1, ElementoAdmin el2){
        return el1.getMarca().compareTo(el2.getMarca());
    }
}
