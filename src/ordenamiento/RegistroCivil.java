package ordenamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ordenamiento.condiciones.Condicion;


public class RegistroCivil {
	
	private Condicion aceptacion;
	private ArrayList<Persona> elementos;

	public RegistroCivil() {
		elementos = new ArrayList<>();
	}
	
	public void addPersona(Persona p) {
		//if (aceptacion.cumple(p))
				elementos.add(p);
	}
	
	public ArrayList<Persona> getPersonas(){
	//	ArrayList<Persona> salida = new ArrayList<Persona>(elementos);
		ArrayList<Persona> salida = new ArrayList<Persona>();
		salida.addAll(elementos);
		Collections.sort(salida);
		return salida;
		
	}
	public ArrayList<Persona> getPersonasInversa(){
	//	ArrayList<Persona> salida = new ArrayList<Persona>(elementos);
		ArrayList<Persona> salida = new ArrayList<Persona>();
		salida.addAll(elementos);
		Collections.sort(salida,Collections.reverseOrder());
		return salida;
		
	}

	public ArrayList<Persona> getPersonas(Comparator<Persona> comp){
		ArrayList<Persona> salida = new ArrayList<Persona>();
		salida.addAll(elementos);
		Collections.sort(salida , comp);
		return salida;
	}
	
	public ArrayList<Persona> buscarPersonas(Condicion  cond){
		ArrayList<Persona> salida = new ArrayList<Persona>();
		for(int i = 0; i<elementos.size();i ++) {
			Persona p1 = elementos.get(i);
			if (cond.cumple(p1)) {
				salida.add(p1);
			}
		}
		return salida;
		
	}
	
	public ArrayList<Persona> buscarPersonas(Condicion cc, Comparator<Persona> orden){
		ArrayList<Persona> salida = this.buscarPersonas(cc);
		Collections.sort(salida, orden);
		return salida;
	}

	
    @Override
	public String toString() {
		return elementos.toString();
	}
}
