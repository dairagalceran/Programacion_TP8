package tp8_ej6_Arbol;

public class ContarCantidadElementosVector implements AccionEjecutable{
    private int cantidad;

    public ContarCantidadElementosVector(){
        this.cantidad =0;
    }

    @Override
    public void ejecutarNodo(Nodo n){
        cantidad ++;
    }

    public int getCantidad(){
        return this.cantidad;
    }
}
