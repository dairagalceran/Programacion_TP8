package prefinal2022;

import java.time.LocalDate;

public class NoticiaVentana  extends Noticia{
    
    private LocalDate fechaLimite;

    public NoticiaVentana(String titulo, String autor, String tema, LocalDate fechaLimite){
        super( titulo, autor, tema);
        this.fechaLimite = fechaLimite;
    }
    
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    @Override
    
    public void addComentario(Comentario comentario){
        LocalDate hoy = LocalDate.now();
        if(hoy.isBefore(this.fechaLimite)){
            super.addComentario(comentario);
        } 
    }

    protected Noticia instanciarNoticia(){
        return  new NoticiaVentana(this.getTitulo(), this.getAutor(), this.getTema(), this.getFechaLimite());
    }

}
