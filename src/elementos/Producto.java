package elementos;

import criterios.Criterio;
import elementos.ElementoLibreria;
import java.util.Vector;


public class Producto extends ElementoLibreria {

	String marca;
	double precio;
	double volumen;
	
	public Producto(String nombre, String marca, double precio, double volumen) {
		super(nombre);
		this.marca=marca;
		this.precio=precio;
		this.volumen = volumen;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public double getPrecio() {
		return precio;
	}
	public double getVolumen() {
		return volumen;
	}
	
	public int cantidadProductos() {
		return 1;
	}


	public Vector<ElementoLibreria> buscar(Criterio c){
		Vector<ElementoLibreria> salida = new Vector<ElementoLibreria>();
		if(c.cumple(this)) {
			salida.add(this);
		}	
		return salida;
		
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
	
	
	
	
	
	
	
	
	
}
