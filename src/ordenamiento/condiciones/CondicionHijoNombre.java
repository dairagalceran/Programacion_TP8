package ordenamiento.condiciones;

import ordenamiento.Persona;


public class CondicionHijoNombre extends Condicion {

	private Condicion sobreHijo;

 @Override
	public boolean cumple(Persona p) {
		
		return p.tenesUnHijo(sobreHijo);
	
	}

}
