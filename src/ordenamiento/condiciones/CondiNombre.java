package ordenamiento.condiciones;

import ordenamiento.Persona;

public class CondiNombre extends Condicion {

	String valor;
	
	public CondiNombre(String valor) {
		super();
		this.valor = valor;
	}

	
	public boolean cumple(Persona p) {
		
		return p.getNombre().equalsIgnoreCase(valor);
	}

}
