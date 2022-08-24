public class ImprimirEnPantalla  implements AccionEjecutable{

    @Override
    public void ejecutarNodo(Nodo nodo){
        System.out.println(nodo.toString());
    }
    
}
