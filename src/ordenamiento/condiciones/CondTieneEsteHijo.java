package ordenamiento.condiciones;

import ordenamiento.Persona;

public class CondTieneEsteHijo extends Condicion {

	Persona elBuscado;
	public boolean cumple(Persona p) {
		// TODO Auto-generated method stub
		return p.tieneHijo(elBuscado);
	}

}
