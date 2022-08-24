package tp8_ej6_Arbol_copy;

public class BuscarMenor implements AccionEjecutable {
    
    private Comparable menor;

    public BuscarMenor(){
        this.menor = null;
    }

    @Override
    public void ejecutarNodo(Nodo nodo){
        Comparable dato =  nodo.getDato();
        if(this.menor == null){
            this.menor = dato;
        } else if (this.menor.compareTo(dato) > 0 ){
            this.menor = dato;
        }
    }

    public Comparable getMenor(){
        return this.menor;
    }

    
}
