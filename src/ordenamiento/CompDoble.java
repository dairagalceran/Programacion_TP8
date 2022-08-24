package ordenamiento;

import java.util.Comparator;

public class CompDoble implements Comparator<Persona>{
	
	Comparator<Persona> p1;
	Comparator<Persona> p2;
	
	public CompDoble(Comparator<Persona> p1, Comparator<Persona> p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	
	public int compare(Persona o1, Persona o2) {
		int resultado = p1.compare(o1, o2);
		if (resultado == 0) {
			resultado = p2.compare(o1, o2);
		}
		return resultado;
	}
	
	
	

}
