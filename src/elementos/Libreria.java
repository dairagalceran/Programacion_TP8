package elementos;

import criterios.Criterio;
import elementos.ElementoLibreria;
import java.util.Vector;


public class Libreria {
	
	
	Criterio politicaPublicidad;
	Vector<ElementoLibreria> utiles;
	
	Kit stock;
	
	
	public boolean saleEnElDiario(ElementoLibreria elemento) {
		
		return politicaPublicidad.cumple(elemento);
	}
	
	
	public void setPoliticaPublicidad(Criterio c) {
		politicaPublicidad = c;
	}

	
	public Vector<ElementoLibreria> buscar(Criterio c){
		Vector<ElementoLibreria> salida = new Vector<ElementoLibreria>();
		
		for (int i = 0; i < utiles.size(); i++) {
			salida.addAll(utiles.get(i).buscar(c));		
			
		}
		return salida;
		
		//return stock.buscar(c);
		
	}
	
	
	
}
