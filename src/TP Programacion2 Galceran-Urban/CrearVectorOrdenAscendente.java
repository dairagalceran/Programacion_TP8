import java.util.ArrayList;

public class CrearVectorOrdenAscendente implements AccionEjecutable{
    
    private ArrayList<Comparable> valores;

    public CrearVectorOrdenAscendente(){
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
