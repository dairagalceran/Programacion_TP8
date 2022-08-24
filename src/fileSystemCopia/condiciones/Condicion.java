package fileSystemCopia.condiciones;
import fileSystemCopia.ElementoFS;


public abstract class Condicion {
    //public abstract boolean cumple(Archivo archivo); // Version ORIGINAL SOBRE ARCHIVO
	public abstract boolean cumple(ElementoFS elemento);
}
