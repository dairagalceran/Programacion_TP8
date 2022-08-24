package recuperatorio2022;
import java.util.Comparator;

public class OrdenarPorPeso implements Comparator<ElementoAutoparte>{
    
    public int compare(ElementoAutoparte el1, ElementoAutoparte el2){
        double resultado = el1.getPeso() - el2.getPeso();
        if(resultado > 0){
            return 1;
        }else if (resultado < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
