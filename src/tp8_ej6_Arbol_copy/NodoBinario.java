package tp8_ej6_Arbol_copy;

public class NodoBinario extends Nodo {

    private Nodo nodoIzq , nodoDer, padre;


    public NodoBinario(){
        super();
        this.nodoDer= null;
        this.nodoIzq = null;
        this.padre = null;
    }

    public Nodo getPadre() {
        return padre;
    }
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }


    @Override
    public  void recorrerEnOrdenEjecutarAccion(AccionEjecutable accion){
        if(this.getNodoIzq() != null){
            this.getNodoIzq().recorrerEnOrdenEjecutarAccion(accion);
        }
        accion.ejecutarNodo(this);
        if(this.getNodoDer() != null){
            this.getNodoDer().recorrerEnOrdenEjecutarAccion(accion);
        } 
    }

    @Override
    public void insertar(Comparable dato){
        if(this.getDato() == null){
            this.setDato(dato);
        }else{
            int result = this.getDato().compareTo(dato);
            if(result > 0){                                   // el elemento ingresado es menor al que ya tiene el arbol
                if(this.getNodoIzq() == null){
                    NodoBinario nodoIzqNuevo = new NodoBinario();
                    nodoIzqNuevo.setPadre(this); // setear el padre al nodo hijo
                    this.nodoIzq= nodoIzqNuevo; //asigno un nuevo valor nodoIzq se vuelve nuevoNodo
                }
                this.nodoIzq.insertar(dato); //insertas el elemento llamando a la misma funcion cuando encuentra un nodo con valor
            }
            else if(result < 0 ){
                if(this.getNodoDer() == null){
                    NodoBinario nodoDerNuevo = new NodoBinario();
                    nodoDerNuevo.setPadre(this);
                    this.nodoDer =  nodoDerNuevo;
                }
                this.nodoDer.insertar(dato);
            }
        }
        
    } // no se evalua el = porque dice que no se guardan iguales

    @Override
    public String toString(){
        return "( " + this.getDato()+" ) ";
    }
}
