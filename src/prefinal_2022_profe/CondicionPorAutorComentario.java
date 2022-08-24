package prefinal_2022_profe;

import java.util.ArrayList;

public class CondicionPorAutorComentario extends Condicion {
	
	private String autor;
	
	public CondicionPorAutorComentario(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		ArrayList<Comentario> comentarios = noticia.getComentarios();
		for (int i = 0; i < comentarios.size(); i++)
			if (comentarios.get(i).getAutor().equals(this.autor))
				return true;
		return false;
	}

}
