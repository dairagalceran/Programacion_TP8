package tp8_ej6_Arbol_copy;

import java.util.ArrayList;
import java.util.Collections;

public class CrearVectorValoresEnOrdenDescendente implements AccionEjecutable  {

    private ArrayList<Comparable> valores;

    public CrearVectorValoresEnOrdenDescendente(){
        this.valores = new ArrayList<Comparable>();
    }
    
    @Override
    public void ejecutarNodo(Nodo n){
        valores.add(n.getDato());
    }

    public ArrayList<Comparable> getValores(){
        Collections.sort(valores, Collections.reverseOrder());
        return this.valores;
    }
    
}
