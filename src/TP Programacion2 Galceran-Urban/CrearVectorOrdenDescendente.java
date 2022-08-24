import java.util.ArrayList;

public class CrearVectorOrdenDescendente implements AccionEjecutable{

    private ArrayList<Comparable> valores;

    public CrearVectorOrdenDescendente(){
        this.valores = new ArrayList<>();
    }

    @Override
    public void ejecutarNodo(Nodo n){
        valores.add( 0 , n.getDato());
    }

    public ArrayList<Comparable> getValores(){
        return this.valores;
    }
}
