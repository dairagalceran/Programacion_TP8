package src-2.marcadores;

import java.util.ArrayList;

public class Categoria extends ElAdmin{

	ArrayList<ElAdmin> els;
	

	public ArrayList<String> getPks(){

		ArrayList<String> salida = new ArrayList<String>();

		for(int i =0; i<els.size(); i++) {
			ElAdmin ei = els.get(i);
			ArrayList<String> aux = ei.getPks();

			for(int j =0; j<aux.size(); j++) {
				if (!salida.contains(aux.get(i)))
					salida.add(aux.get(i));
			}
		}
		return salida;
	}
	
}
