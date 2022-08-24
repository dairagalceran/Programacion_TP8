package parcial2021;
import java.util.ArrayList;


public abstract class ElementoLibreria {

	private String nombre;

	public ElementoLibreria(String nombre) {
		this.nombre=nombre;
	}
	
	public abstract String getMarca();
	public abstract double getPrecio();
	public abstract double getVolumen();
	
	public abstract int cantidadProductos();
	
	public abstract ArrayList<ElementoLibreria> buscar(Buscador cond);
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 @Override
	
	public boolean equals(Object o) {
		try {
			ElementoVenta ele = (ElementoVenta)o;
			return ele.getNombre().equals(nombre);
		} catch(Exception e) {
			//e.printStackTrace();
			return false;
		}
	}
	
}
