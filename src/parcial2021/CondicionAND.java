package parcial2021;

public  class CondicionAND extends Buscador{

    private  Buscador cond1;
    private  Buscador cond2;

    public CondicionAND(Buscador cond1, Buscador cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean esCumplidaPor(ElementoVenta el){
        return cond1.esCumplidaPor(el) && cond2.esCumplidaPor(el);
    }
    
}