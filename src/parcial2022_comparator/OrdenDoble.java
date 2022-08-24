package parcial2022_comparator;
import java.util.Comparator;

public class OrdenDoble implements Comparator<ElementoAdmin>{
    Comparator<ElementoAdmin> el1;
    Comparator<ElementoAdmin> el2;

    public OrdenDoble(Comparator<ElementoAdmin> el1, Comparator<ElementoAdmin> el2){
        this.el1 = el1;
        this.el2 = el2;
    }

    @Override
    public int compare(ElementoAdmin otroel1, ElementoAdmin otroel2){
        int resultado = el1.compare(otroel1, otroel2);
        if(resultado == 0){
            resultado = el2.compare(otroel1, otroel2);
        }
        return resultado;
    }
}
