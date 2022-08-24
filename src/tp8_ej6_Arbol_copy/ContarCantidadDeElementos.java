package tp8_ej6_Arbol_copy;

public class ContarCantidadDeElementos implements AccionEjecutable {
    private int cantidad;

    public ContarCantidadDeElementos(){
        this.cantidad = 0;
    }

    @Override
    public void ejecutarNodo(Nodo nodo) {
        cantidad++;   
    }
    
    public int getCantidad(){ 
        return this.cantidad;
    }
}
