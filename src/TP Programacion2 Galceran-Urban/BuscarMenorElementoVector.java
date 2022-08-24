public class BuscarMenorElementoVector implements AccionEjecutable{
   
    private Comparable menor;

    public BuscarMenorElementoVector(){
        this.menor = null;
    }
    
    @Override
    public void ejecutarNodo(Nodo n){
        Comparable dato = n.getDato();
        if(this.menor == null){
            this.menor = dato;
        }else {
            int resultado = this.menor.compareTo(dato);
            if(resultado > 0){
                this.menor = dato;
            }
        }
    }

    public Comparable getMenor(){
        return this.menor;
    }
}
