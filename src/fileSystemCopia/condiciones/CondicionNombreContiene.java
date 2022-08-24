package fileSystemCopia.condiciones;
import fileSystemCopia.ElementoFS;


public class CondicionNombreContiene extends Condicion{
    private String subcadena;

    public CondicionNombreContiene(String subcadena) {
        this.subcadena = subcadena;
    }

    @Override
    public boolean cumple(ElementoFS elemento) {
        return elemento.getNombre().contains(subcadena);
    }
}
