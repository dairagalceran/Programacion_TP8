package tp8_ej6_Arbol_copy;

public class ArbolBinario extends Arbol{
    
    @Override
    public Nodo crearNodoRaiz(){
        return new NodoBinario();
    }
    
}
