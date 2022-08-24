package ordenamiento;
import java.util.ArrayList;
import ordenamiento.condiciones.Condicion;



public class Persona  implements Comparable<Persona>{

	String nombre;
	String apellido;
	int edad;
	ArrayList<Persona> hijos;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public boolean tieneHijo(Persona p1) {
		return hijos.contains(p1);
	}
	
	public boolean tenesUnHijo(Condicion c) {
		for (int i =0 ; i<hijos.size();i++) {
			if (c.cumple(hijos.get(i)))
				return true;
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

 @Override
	public int compareTo(Persona o) {
		
		return edad - o.getEdad();
	}

 @Override
	public String toString() {
		
		return   nombre + "-" + apellido +"-" +edad;
	}
	
 @Override
	public boolean equals(Object o1) {
		Persona p1 = (Persona) o1;
		return nombre.equals(p1.getNombre());
		
	}
	
	public ArrayList<Persona> getHijos(){
		return new ArrayList<Persona>(hijos);
	}
	
	
}
