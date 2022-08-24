package tp8_ej6_Arbol_copy;

public abstract class Nodo{
    
    protected Comparable dato;

    public Nodo(){
        this.dato = null;
    }

    public Comparable getDato() {
        return dato;
    }

    public void setDato(Comparable dato) {
        this.dato = dato;
    }

    public abstract void recorrerEnOrdenEjecutarAccion(AccionEjecutable accion);
    public abstract void insertar(Comparable dato);

    @Override
    public String toString(){
        return "( " + this.getDato()+" ) ";
    }
}