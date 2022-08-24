package fileSystem7;


import fileSystem7.Archivo;
import fileSystem7.condiciones.Condicion;
import java.time.LocalDate;
import java.util.ArrayList;



public abstract class ElementoFS {
    private final LocalDate fCreacion;
    private String nombre;
    private LocalDate fModificacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        fCreacion = LocalDate.now();
        fModificacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setfModificacion(LocalDate.now());
    }

    public LocalDate getfModificacion() {
        return fModificacion;
    }
    protected void setfModificacion(LocalDate fModificacion) {
        this.fModificacion = fModificacion;
    }

    public abstract double getTamanio();
    public abstract int cantidadArchivos();
    public abstract ArrayList<Archivo> buscar(Condicion condicion);
}
