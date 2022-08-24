package prefinal_2022_profe;

public class CondicionPorTema extends Condicion {
	
	private String tema;
	
	public CondicionPorTema(String tema) {
		this.tema = tema;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTema().equals(tema);
	}

}
