public class BuscarMayorElementoVector implements AccionEjecutable {
  
    private Comparable mayor;

    public BuscarMayorElementoVector(){
        this.mayor = null;
    }

    @Override
    public void ejecutarNodo(Nodo n){
        Comparable dato = n.getDato();
        if(this.mayor == null){
            this.mayor = dato;
        }
        else{
            int resultado = this.mayor.compareTo(dato);
            if(resultado < 0){
                this.mayor = dato;
            }   
        }
    }

    public Comparable getMayor(){
        return this.mayor;
    }


}
