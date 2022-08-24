package ordenamiento.condiciones;
import ordenamiento.Persona;

public class ConMenorEdad extends Condicion {

	private int valor;
	
	public ConMenorEdad(int valor) {
		super();
		this.valor = valor;
	}
 @Override
	public boolean cumple(Persona p) {
		
		return p.getEdad() < valor;
	}


	

}
