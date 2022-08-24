package fileSystem7.condiciones;

import fileSystem7.Archivo;

public class CondicionAnd extends Condicion{
    
    private Condicion cond1, cond2;

    public CondicionAnd(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }


    @Override
    public boolean cumple(Archivo archivo) {
        return cond1.cumple(archivo) && cond2.cumple(archivo);
    }
}
