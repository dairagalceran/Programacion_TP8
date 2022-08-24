package prefinal_2022_profe;

public class Comentario {
	
	private String autor, texto;

	public Comentario(String autor, String texto) {
		this.autor = autor;
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return this.getAutor() + ": " + this.getTexto();
	}

}
