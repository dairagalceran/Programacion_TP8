package ordenamiento;

import java.util.Comparator;

public class ComApellido implements Comparator<Persona>{

	
	public int compare(Persona o1, Persona o2) {
		
		return o1.getApellido().compareTo(o2.getApellido()) ;
	}

}