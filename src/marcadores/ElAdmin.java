package src-2.marcadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collections;

public abstract class ElAdmin {

	
	public abstract ArrayList<String> getPks();
	//public abstract ArrayList<Marcador> buscar(Condicion c);

	public  ArrayList<Marcador> buscar(Condicion c, Comparator orden){
		ArrayList<Marcador> aux = this.buscar(c);
		Collections.sort(aux,orden);
		return aux;
	};
	
	public int cantPks() {
		return this.getPks().size();
	}
}

