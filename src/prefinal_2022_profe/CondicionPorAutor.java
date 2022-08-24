package prefinal_2022_profe;

public class CondicionPorAutor extends Condicion {
	
	private String autor;
	
	public CondicionPorAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getAutor().equals(this.autor);
	}

}
