package ordenamiento;


import java.util.Comparator;

public class CompEdad implements Comparator<Persona>{

	
	public int compare(Persona o1, Persona o2) {
		
		if (o1.getEdad() < o2.getEdad() )
			return -1;
		else if (o1.getEdad() > o2.getEdad() )
			return 1;
		else return 0;
		
		//return o1.getEdad() - o2.getEdad()
	}

}