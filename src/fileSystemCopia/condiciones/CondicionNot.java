package fileSystemCopia.condiciones;
import fileSystemCopia.ElementoFS;

public class CondicionNot extends Condicion{
    private Condicion positiva;

    public CondicionNot(Condicion positiva) {
        this.positiva = positiva;
    }

    @Override
    public boolean cumple(ElementoFS elemento) {
        return !positiva.cumple(elemento);
    }
}
