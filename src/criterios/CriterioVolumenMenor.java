package criterios;

import elementos.ElementoLibreria;

public class CriterioVolumenMenor extends Criterio {

	double valor;
	
	public  CriterioVolumenMenor(double v) {
		valor = v;
	}
	
	@Override
	public boolean cumple(ElementoLibreria el) {
		
		return el.getVolumen() < valor;
	}

}
