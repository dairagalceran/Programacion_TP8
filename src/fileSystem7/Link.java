package fileSystem7;

import fileSystem7.Archivo;
import fileSystem7.condiciones.Condicion;
import java.util.ArrayList;


public class Link extends ElementoFS{
    private static final double TAMANIO_LINK = 1;
    private static final String PREFIJO_LINK = "Acceso directo a ";
    private ElementoFS destino;

    public Link(ElementoFS destino){
        super(PREFIJO_LINK+destino.getNombre());
        this.destino = destino;
    }

    public ElementoFS getDestino() {
        return destino;
    }

    @Override
    public double getTamanio() {
        return TAMANIO_LINK;
    }

    @Override
    public int cantidadArchivos() {
        return 0;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        return destino.buscar(condicion);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Link otro = (Link) o;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getDestino().equals(otro.getDestino());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
