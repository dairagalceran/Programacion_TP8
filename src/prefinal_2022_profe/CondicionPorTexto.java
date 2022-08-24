package prefinal_2022_profe;

public class CondicionPorTexto extends Condicion {
	
	private String palabra;
	
	public CondicionPorTexto(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTexto().contains(palabra);
	}

}
