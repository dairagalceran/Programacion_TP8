package tp8_ej6_Arbol_copy;

public abstract class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
        this.raiz = this.crearNodoRaiz();
    }

    public abstract Nodo crearNodoRaiz();
    
    public  void recorrerEnOrdenEjecutarAccion(AccionEjecutable accion){
        this.raiz.recorrerEnOrdenEjecutarAccion(accion);
    }

    public void insertar(Comparable dato){
        this.raiz.insertar(dato);
    }

}
