package recuperatorio2022;
import java.util.Comparator;

public class OrdenarPorMarca implements Comparator<ElementoAutoparte> {
    
    public int compare(ElementoAutoparte el1, ElementoAutoparte el2){
        return el1.getMarca().compareTo(el2.getMarca());
    }
}
