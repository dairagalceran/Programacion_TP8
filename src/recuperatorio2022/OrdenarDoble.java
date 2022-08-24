package recuperatorio2022;

import java.util.Comparator;

public class OrdenarDoble  implements Comparator<ElementoAutoparte>{
    
    private Comparator<ElementoAutoparte> comp1;
    private Comparator<ElementoAutoparte> comp2;

    public OrdenarDoble(Comparator<ElementoAutoparte> comp1 , Comparator<ElementoAutoparte> comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    public int compare(ElementoAutoparte el1, ElementoAutoparte el2){
        int resultado = this.comp1.compare(el1 , el2);
        if(resultado == 0){
            return this.comp2.compare(el1, el2);
        }
        return resultado;
    }
}
