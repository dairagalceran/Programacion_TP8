package parcial2022;

public class CondicionAND extends CondicionBusqueda {

    private CondicionBusqueda cond1;
    private CondicionBusqueda cond2;

    public CondicionAND (CondicionBusqueda cond1, CondicionBusqueda cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean esCumplidaPor(ElementoAdmin el){
        return cond1.esCumplidaPor(el) && cond2.esCumplidaPor(el);
    }
}
