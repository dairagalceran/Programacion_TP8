package prefinal_2022_profe;

import java.time.LocalDate;

public class NoticiaConVentana extends Noticia {
	
	private LocalDate fecha;

	public NoticiaConVentana(String titulo, String texto, String autor, String tema, LocalDate fecha) {
		super(titulo, texto, autor, tema);
		this.fecha = fecha;
	}
	
	@Override
	public void addComentario(Comentario c) {
		if (LocalDate.now().isBefore(this.fecha))
			super.addComentario(c);
	}
	
	@Override
	protected Noticia instanciarCopia() {
		return new NoticiaConVentana(this.getTitulo(), this.getTexto(), this.getAutor(), this.getTema(), this.getFecha());
	}

	private LocalDate getFecha() {
		return this.fecha;
	}

}
