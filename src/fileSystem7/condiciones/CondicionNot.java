package fileSystem7.condiciones;


public class CondicionNot extends Condicion{
    private Condicion positiva;

    public CondicionNot(Condicion positiva) {
        this.positiva = positiva;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return ! positiva.cumple(archivo);
    }
}
