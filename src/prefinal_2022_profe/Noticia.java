package prefinal_2022_profe;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia {
	
	private String titulo, texto, autor, tema;
	private ArrayList<Comentario> comentarios;
	
	

	public Noticia(String titulo, String texto, String autor, String tema) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.autor = autor;
		this.tema = tema;
		this.comentarios = new ArrayList<>();
	}

	@Override
	public int contar(Condicion c) {
		if (c.cumple(this))
			return 1;
		else
			return 0;
	}

	@Override
	public String getTema() {
		return this.tema;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public ArrayList<Comentario> getComentarios() {
		return new ArrayList<>(this.comentarios);
	}
	
	public void addComentario(Comentario c) {
		this.comentarios.add(c);
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	protected Noticia instanciarCopia() {
		return new Noticia(this.getTitulo(), this.getTexto(), this.getAutor(), this.getTema());
	}
	
	@Override
	public ElementoNoticia getCopiaRestringida(Condicion c) {
		if (c.cumple(this)) {
			Noticia copia = instanciarCopia();
			// Copio los comentarios
			for (int i = 0; i < this.comentarios.size(); i++)
				copia.addComentario(this.comentarios.get(i));
			return copia;
		}
		else
			return null;
	}

}
