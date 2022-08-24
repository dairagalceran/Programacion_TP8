package criterios;

import elementos.ElementoLibreria;

public class CriterioPrecioMayor extends Criterio {

	double valor;
	
	public  CriterioPrecioMayor(double v) {
		valor = v;
	}
	
	@Override
	public boolean cumple(ElementoLibreria el){
		
		return el.getPrecio() >valor;
	}

}
