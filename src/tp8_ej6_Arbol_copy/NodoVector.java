package tp8_ej6_Arbol_copy;


public class NodoVector  extends Nodo{
    
    private NodoVector siguiente, anterior;

    public NodoVector(){
        this.siguiente = null;
        this.anterior = null;
    }

    @Override
    public  void recorrerEnOrdenEjecutarAccion(AccionEjecutable accion){
        if(this.anterior != null){
            this.anterior.recorrerEnOrdenEjecutarAccion(accion);
        }
        accion.ejecutarNodo(this);
        if(this.siguiente != null){
            this.siguiente.recorrerEnOrdenEjecutarAccion(accion);
        } 
    }

    @Override
    public void insertar(Comparable dato){
        if(this.getDato() == null){
            this.setDato(dato);
        }else{
            int result = this.getDato().compareTo(dato);
            if(result > 0){                                  
                if(this.anterior == null){
                    NodoVector nodoIzqNuevo = new NodoVector();
                    //nodoIzqNuevo.setPadre(this); 
                    this.anterior= nodoIzqNuevo; 
                }
                this.anterior.insertar(dato); 
            }
            else if(result < 0 ){
                if(this.siguiente == null){
                    NodoVector nodoDerNuevo = new NodoVector();
                    //nodoDerNuevo.setPadre(this);
                    this.siguiente =  nodoDerNuevo;
                }
                this.siguiente.insertar(dato);
            }
        }
        
    } 
}
