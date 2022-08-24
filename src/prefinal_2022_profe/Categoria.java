package prefinal_2022_profe;

import java.util.ArrayList;

public class Categoria extends ElementoNoticia {
	
	private ArrayList<ElementoNoticia> elementos;
	private int posTema;
	
	public Categoria(int posTema) {
		this.posTema = posTema;
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoNoticia e) {
		this.elementos.add(e);
	}

	@Override
	public int contar(Condicion c) {
		int cont = 0;
		for (int i = 0; i < this.elementos.size(); i++)
			cont += this.elementos.get(i).contar(c);
		return cont;
	}

	@Override
	public String getTema() {
		// Si no hay elementos retorna null
		if (elementos.isEmpty())
			return null;
		else
			// Si la posici�n es una posici�n v�lida seg�n la cantidad de elementos, retorno el tema de esa posici�n
			if (0 < posTema && posTema < elementos.size())
				return this.elementos.get(posTema).getTema();
			else // Si posTema no es una posici�n v�lida dada la cantidad de elementos, retorno el primer tema
				return this.elementos.get(0).getTema();
	}

	@Override
	public ElementoNoticia getCopiaRestringida(Condicion c) {
		ArrayList<ElementoNoticia> hijosQueCumplen = new ArrayList<>();
		// Obtengo la copia de los hijos que cumplen con c
		for (int i = 0; i < elementos.size(); i++) {
			ElementoNoticia copiaHijo = elementos.get(i).getCopiaRestringida(c);
			if (copiaHijo != null)
				hijosQueCumplen.add(copiaHijo);
		}
		
		if (hijosQueCumplen.isEmpty()) // Si no tiene hijos que cumplen NO se retorna copia
			return null;
		else {
			// Instancio la copia
			Categoria copia = new Categoria(this.getPosTema());
			// Agrego los hijos que cumplen
			for (int j = 0; j < hijosQueCumplen.size(); j++)
				copia.addElemento(hijosQueCumplen.get(j));
			return copia;
		}
	}

	public int getPosTema() {
		return this.posTema;
	}

}
