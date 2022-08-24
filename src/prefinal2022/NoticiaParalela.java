package prefinal2022;

public class NoticiaParalela extends Noticia {
    
    private Noticia paralela;

    public NoticiaParalela (String titulo, String autor, String tema, Noticia paralela){
        super(titulo, autor, tema);
        this.paralela = paralela;
    }

    public void addComentario(Comentario comentario){
        this.paralela.addComentario(comentario);
        super.addComentario(comentario);
    }

    public ElementoSitio getCopiaRestringida(CondicionBusqueda cond){
        return null; // no quiero agregar a la copia
    }
}
