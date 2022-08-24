package ordenamiento;
import java.util.ArrayList;
import ordenamiento.condiciones.CAnd;
import ordenamiento.condiciones.COr;
import ordenamiento.condiciones.ConMenorEdad;
import ordenamiento.condiciones.CondiNombre;
import ordenamiento.condiciones.CondiApellido;

import ordenamiento.condiciones.Condicion;

public class Principal {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("terna","sedal",7);
		Persona p2 = new Persona("terna","sedal",2);
		Persona p3 = new Persona("amor","reda",5);
		Persona p4 = new Persona("terna","seda",3);
		Persona p5 = new Persona("amparo","espera",1);
		RegistroCivil rg = new RegistroCivil();
		rg.addPersona(p1);
		rg.addPersona(p2);
		rg.addPersona(p3);
		rg.addPersona(p4);
		rg.addPersona(p5);	
		
		System.out.println("------Reg civil----------");	
		System.out.println(rg);
		
		Condicion conNom = new CondiNombre("amor");
		Condicion conAp = new CondiApellido("reda");
		Condicion conEdad = new ConMenorEdad(4);
		CAnd condAnd = new CAnd(conNom, conEdad);
		CAnd condAnd1 = new CAnd(conAp , condAnd);

		ArrayList<Persona> buscados = rg.buscarPersonas(condAnd1);
		System.out.println("-------buscados------");
		System.out.println(buscados);


		CompNombre cnn = new CompNombre();
		ComApellido cna = new ComApellido();
		CompDoble cd = new CompDoble(cnn, cna);
		CompEdad cee = new CompEdad();
		CompDoble cd2 = new CompDoble(cd, cee);
		
		ArrayList<Persona> ordenados = rg.getPersonas(cd2);
		System.out.println();
		System.out.println("------- comparator--------");
		System.out.println(ordenados);
		
		System.out.println();
		System.out.println("--- registro luego de ordenar-----");
		System.out.println(rg);

		System.out.println();
		System.out.println("----busca con condicion y comparator-------");
		ArrayList<Persona> buscarOrdenados = rg.buscarPersonas(conEdad, cd);
		System.out.println(buscarOrdenados);

		System.out.println();
		System.out.println("--- registro luego de buscar ordenado-----");
		System.out.println(rg);
		
	}
}