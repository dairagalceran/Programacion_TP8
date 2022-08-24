package prefinal2022;
import java.util.ArrayList;

public class Noticia extends ElementoSitio{
    private String titulo, texto, autor, tema;
    private ArrayList<Comentario> comentarios;

    public Noticia(String titulo, String autor, String tema){
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.comentarios = new ArrayList<Comentario>();
    }

    public String getAutor() {
        return autor;
    }
    public String getTema() {
        return tema;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public ArrayList<Comentario> getComentarios() {
        return  new ArrayList<Comentario>(comentarios);
    }  

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    protected Noticia instanciarNoticia(){
        return  new Noticia(this.getTitulo(), this.getAutor(), this.getTema());
    }
    
    public ElementoSitio getCopiaRestringida(CondicionBusqueda cond){
        if(cond.esCumplidaPor(this)){
            Noticia copia = instanciarNoticia();
            for(int i =0; i< this.comentarios.size(); i++){
                copia.addComentario(this.comentarios.get(i));
            }
                return copia;
        }
        else{
            return null;
        }   
    }

    public String imprimir(String pref){
        return pref + this.toString();
    }

    public String toString(){
        String retorno = "\n\nNoticia: "+ this.getTitulo()+ ", Tema: "+this.getTema()+", Autor: "+this.getAutor();
        int i = 0;
        while(i < comentarios.size()){
            retorno+= comentarios.get(i).toString();
            if(i != comentarios.size()){
                retorno += ";";
                i++;
            }
        }
        return retorno;
    }
}
