package prefinal2022;

public class Comentario {

    private String suscriptor, comentario;

    public Comentario(String suscriptor, String comentario){
        this.suscriptor = suscriptor;
        this.comentario = comentario;
    }
    public String getSuscriptor() {
        return suscriptor;
    }
    public String getComentario() {
        return comentario;
    }

    public String toString(){
        return "\nSuscriptor: "+ this.getSuscriptor()+", comentario: "+this.getComentario();
    }
    
}
