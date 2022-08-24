package ordenamiento.condiciones;

import ordenamiento.Persona;

public class CAnd extends Condicion{
	Condicion c1;
	Condicion c2;
	
	
	public CAnd(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	public boolean cumple(Persona p) {
		return c1.cumple(p) && c2.cumple(p);
	}

}
