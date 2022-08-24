package fileSystemCopia;
import fileSystemCopia.ElementoFS;
import fileSystemCopia.condiciones.*;
import java.time.LocalDate;
import java.util.ArrayList;


public abstract class ElementoFS {
    private LocalDate fCreacion;
    private String nombre;
    private LocalDate fModificacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        fCreacion = LocalDate.now();
        fModificacion = LocalDate.now();
    }

    
    public abstract double getTamanio();
    public abstract int cantidadArchivos();
    public abstract ArrayList<Archivo> buscar(Condicion condicion);
    public abstract String imprimir(String pref);
    
    public abstract ElementoFS getCopia();
    public abstract ElementoFS getCopiaRestringida(Condicion condicion);
    



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setfModificacion(LocalDate.now());
    }

    public LocalDate getfCreacion() {
    	return fCreacion;
    }
    
    public LocalDate getfModificacion() {
        return fModificacion;
    }
    protected void setfModificacion(LocalDate fModificacion) {
        this.fModificacion = fModificacion;
    }
    
    protected void setfCreacion(LocalDate fCreacion) {
    	this.fCreacion = fCreacion;
    }

}
