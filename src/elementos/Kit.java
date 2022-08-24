package elementos;

import java.util.Vector;

import criterios.Criterio;

public class Kit extends ElementoLibreria {

  Vector<ElementoLibreria>  elems;
  
  public Kit(String nombre) {
	  super(nombre);
	  elems = new Vector<ElementoLibreria>();
  }
  
  public void addElemento(ElementoLibreria elemento) {
	 if (!elems.contains(elemento)) 
	    elems.add(elemento);
  }
  

  public double getPrecio() {
	  double suma = 0;
	  for(int i =0; i<elems.size();i++) {
		  suma = suma + elems.elementAt(i).getPrecio();
	  }
	  return suma;
  }
  
  public double getVolumen() {
	  double mayor = 0;
	  for(int i =0; i<elems.size();i++) {
		  double valorAux = elems.get(i).getVolumen();
		  if (valorAux > mayor) {
			  mayor = valorAux;
		  }
	  }  
	   return mayor;	  
	  
  }
  
  
  public String getMarca() {
	 if (elems.size()>0)
	  return elems.get(0).getMarca();
	 else
		return null;
  }
  
  
  public int cantidadProductos() {
	  int suma =0;
	  
	  for (int i = 0; i < elems.size(); i++) {
		suma = suma + elems.get(i).cantidadProductos();  
		
	  }
	  return suma;
	  
  }
  
	public Vector<ElementoLibreria> buscar(Criterio c){
		Vector<ElementoLibreria> salida = new Vector<ElementoLibreria>();
		
		if (c.cumple(this)) {
			salida.add(this);
		}
		
		for (int i = 0; i < elems.size(); i++) {
			salida.addAll(elems.get(i).buscar(c));
		}
		
		return salida;
		
	}
	
  
	
}
