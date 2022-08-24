package fileSystemCopia.condiciones;
import fileSystemCopia.ElementoFS;


public class CondicionAnd extends Condicion{
    private Condicion cond1, cond2;

    public CondicionAnd(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }


    @Override
    public boolean cumple(ElementoFS elemento) {
        return cond1.cumple(elemento) && cond2.cumple(elemento);
    }
}
