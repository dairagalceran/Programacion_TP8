package tp8_ej6_Arbol;


public class Nodo{
    private Comparable dato;
    private Nodo nodoIzq , nodoDer;


    public Nodo(){
        this.dato = null;
        this.nodoDer= null;
        this.nodoIzq = null;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setDato(Comparable valor) {
        this.dato = valor;
    }
    public Comparable getDato() {
        return dato;
    }

    public void insertar( Comparable dato){
        if(this.dato == null){
            this.dato = dato;
        }else{
            int result = this.getDato().compareTo(dato);
        if(result > 0){                           // el elemento ingresado es menor al que ya tiene el arbol
            if(this.getNodoIzq() == null){
                Nodo nodoIzqNuevo = new Nodo();
                this.nodoIzq =nodoIzqNuevo; //asigno un nuevo valor nodoIzq se vuelve nuevoNodo
            }
            this.nodoIzq.insertar( dato); //insertas el elemento llamando a la misma funcion cuando encuentra un nodo con valor
            }
            else if(result < 0 ){
                if(this.getNodoDer() == null){
                    Nodo nodoDerNuevo = new Nodo();
                    this.nodoDer = nodoDerNuevo;
                }
                this.nodoDer.insertar( dato);
            }
        }
    }

    public void ejecutarAccion( AccionEjecutable accion){
        if(this.getNodoIzq() != null){
            this.getNodoIzq().ejecutarAccion( accion);
        }
        accion.ejecutarNodo(this);
        if(this.getNodoDer() != null){
            this.getNodoDer().ejecutarAccion(accion);
        }
    }

    @Override
    public String toString(){
        return "Nodo (" + this.getDato()+") ";
    }
}