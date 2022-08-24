package prefinal2021;

import java.util.ArrayList;

public class Marcador extends ElementoAdministrador {
    private String titulo, url, usuarioNombre;
    private ArrayList<String> palabrasClaves;

    public Marcador(String titulo,String url, String usuarioNombre){
        this.titulo = titulo;
        this.url = url;
        this.usuarioNombre = usuarioNombre;
        this.palabrasClaves = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUrl() {
        return url;
    }
    public String getUsuarioNombre() {
        return usuarioNombre;
    }
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(palabrasClaves);
    }

    public void addPalabrasClaves(String nuevaPalabraClave){
        if(!palabrasClaves.contains(nuevaPalabraClave)){
            palabrasClaves.add(nuevaPalabraClave);
        }
    }

    public boolean tienePalabraClave(String palabraABuscar){
        return palabrasClaves.contains(palabraABuscar);
    }

    public int contarCantidadMarcadores(){
        return 1;
    }

    @Override
    public ArrayList<Marcador> buscarPor(CondicionBusqueda cond){
        ArrayList<Marcador> salida = new ArrayList<>();
        if(cond.esCumplidaPor(this)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public ElementoAdministrador getCopia(){
        Marcador copia = new Marcador(this.getTitulo(), this.getUrl(), this.getUsuarioNombre());
        //por que hay palabras claves en un arrylist las tengo recorrer y copiar 
        if(palabrasClaves.size()!= 0){
            for(int i = 0; i< palabrasClaves.size(); i++){
                copia.addPalabrasClaves(this.palabrasClaves.get(i));
            }
        }
        return copia;
    }

    @Override
    public ElementoAdministrador getCopiaRestringida(CondicionBusqueda cond){
        if(cond.esCumplidaPor(this)){
            return this.getCopia();
        }
        else{
            return null;
        }
    }

    public String imprimir(String pref){
        return pref + this.toString();
    }
    
    public String toString(){
        String retorno = "Marcador: "+ this.getTitulo()+ ", url: "+ this.getUrl()+", Usuario: "+this.getUsuarioNombre()+ ", Palabras claves: ";
        int i =0;
        while(i < palabrasClaves.size()){
            retorno += palabrasClaves.get(i);
            i++;
            retorno += ", ";
        }
        return retorno+"\n";
    }

}
