package fileSystem7.condiciones;


public class CondicionOr extends Condicion{
    private Condicion cond1, cond2;

    public CondicionOr(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }


    @Override
    public boolean cumple(Archivo archivo) {
        return cond1.cumple(archivo) || cond2.cumple(archivo);
    }
}
