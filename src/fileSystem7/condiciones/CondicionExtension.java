package fileSystem7.condiciones;


public class CondicionExtension extends Condicion{
    private String extensionBuscada;

    public CondicionExtension(String extensionBuscada) {
        this.extensionBuscada = extensionBuscada;
    }

    @Override
    public boolean cumple(Archivo archivo){
        return archivo.getExtension().equals(this.extensionBuscada);
    }
}
