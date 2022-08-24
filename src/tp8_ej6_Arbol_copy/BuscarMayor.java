package tp8_ej6_Arbol_copy;

public class BuscarMayor implements AccionEjecutable {
    private Comparable mayor;

    public BuscarMayor(){
        this.mayor = null;
    }
    @Override
    public void ejecutarNodo(Nodo nodo){
        Comparable dato =  nodo.getDato();
        if(this.mayor == null){
            this.mayor = dato;
        } else if (this.mayor.compareTo(dato) < 0 ){
            this.mayor = dato;
        }
    }

    public Comparable getMayor(){
        return this.mayor;
    }

    
}
