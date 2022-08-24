package fileSystemCopia;

import fileSystemCopia.condiciones.Condicion;
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
    
	@Override
	public String imprimir(String pref) {
		return pref + this.toString();
	}
	
 @Override
	public ElementoFS getCopia() {
		Link copia = new Link(this.getDestino());
		
		return copia;
	}
	
	@Override
	/*public ElementoFS getCopiaRestringida(Condicion condicion) {	// Version ORIGINAL CON CONDICION SOBRE ARCHIVO
		return null;
	}*/
	public ElementoFS getCopiaRestringida(Condicion condicion) {	
		if (condicion.cumple(this))
			return getCopia();
		else
			return null;
	}

}
