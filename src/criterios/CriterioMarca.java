package criterios;

import elementos.ElementoLibreria;

public class CriterioMarca extends Criterio {

	private String unaMarca;
	
	 public CriterioMarca(String ss) {
		this.unaMarca =ss;
	}
	@Override
	public boolean cumple(ElementoLibreria el) {
		return el.getMarca().equalsIgnoreCase(unaMarca);
	}

}
