package tp8_ej6_Arbol_copy;

import java.util.ArrayList;

public class CrearVectorValoresEnOrdenAscendente implements AccionEjecutable  {

    private ArrayList<Comparable> valores;

    public CrearVectorValoresEnOrdenAscendente(){
        this.valores = new ArrayList<>();
    }
    
    @Override
    public void ejecutarNodo(Nodo n){
        valores.add(n.getDato());
    }

    public ArrayList<Comparable> getValores(){
        return this.valores;
    }
    
}
