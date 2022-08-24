package fileSystemCopia;
import fileSystemCopia.condiciones.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElementoFS implements Comparable<Archivo>{
    private double tamanio;
    private String extension;

    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantidadArchivos() {
        return 1;
    }


    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        if (condicion.cumple(this))
            resultado.add(this);
        return resultado;
    }


    public String getExtension() {
        return extension;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.setfModificacion(LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Archivo otro = (Archivo) o;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getExtension().equals(otro.getExtension());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombre()+"."+this.getExtension()+" ("+this.getTamanio()+"Kb)";
    }
    
	@Override
	public String imprimir(String pref) {
		return pref + this.toString();
	}

    @Override
    public int compareTo(Archivo o) {
        int resultado = this.getExtension().compareTo(o.getExtension());
        if (resultado == 0)
            return (int) this.getTamanio() - (int) o.getTamanio();
        return resultado;
    }

	@Override
	public ElementoFS getCopia() {
		Archivo copia = new Archivo(this.getNombre(), this.getExtension(), this.getTamanio()); // No estoy creando una copia
		// Copiamos info que no se almacena en el constructor
		copia.setfModificacion(this.getfModificacion());
		copia.setfCreacion(this.getfCreacion());
		
		return copia;
	}
    
    @Override
	public ElementoFS getCopiaRestringida(Condicion condicion) {
		if (condicion.cumple(this))
			return getCopia();
		else
			return null;
	}

}
