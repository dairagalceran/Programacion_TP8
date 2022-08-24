package fileSystem7.condiciones;

public class CondicionNombreContiene extends Condicion{
    private String subcadena;

    public CondicionNombreContiene(String subcadena) {
        this.subcadena = subcadena;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getNombre().contains(subcadena);
    }
}
