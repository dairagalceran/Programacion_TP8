package tp8_ej6_Arbol_copy;

public class ArbolVector extends Arbol {
   
    @Override
    public Nodo crearNodoRaiz(){
        return new NodoVector();
    }
}
