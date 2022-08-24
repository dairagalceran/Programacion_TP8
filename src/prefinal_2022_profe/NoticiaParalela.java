package prefinal_2022_profe;

public class NoticiaParalela extends Noticia {
	
	private Noticia paralela;

	public NoticiaParalela(String titulo, String texto, String autor, String tema, Noticia paralela) {
		super(titulo, texto, autor, tema);
		this.paralela = paralela;
	}
	
	@Override
	public void addComentario(Comentario c) {
		this.paralela.addComentario(c);
		super.addComentario(c);
	}
	
	@Override
	public ElementoNoticia getCopiaRestringida(Condicion c) {
		return null;
	}

}
