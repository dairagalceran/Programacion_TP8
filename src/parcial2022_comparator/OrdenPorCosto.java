package parcial2022_comparator;
import java.util.Comparator;

public class OrdenPorCosto implements Comparator<ElementoAdmin> {

    @Override
    public int compare(ElementoAdmin el1, ElementoAdmin el2){

        double resultado = el1.getCosto() - el2.getCosto();

        if(resultado > 0)
            return 1;
        else if (resultado < 0 )
            return -1;
            else
            return 0;
    }
    
}
