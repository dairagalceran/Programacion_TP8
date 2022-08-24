package recuperatorio2022;
import java.util.Comparator;

public class OrdenarPorHuellaCO2 implements Comparator<ElementoAutoparte> {
    
    public int compare(ElementoAutoparte el1, ElementoAutoparte el2){
        double resultado = el1.getHuellaCO2() - el2.getHuellaCO2();
        if(resultado > 0){
            return 1;
        }else if (resultado < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
