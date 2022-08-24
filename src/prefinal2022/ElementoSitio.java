package prefinal2022;

public abstract class ElementoSitio {
    
    

    //public abstract ElementoSitio getCopia();
    public abstract ElementoSitio getCopiaRestringida(CondicionBusqueda cond);
    public abstract String getTema();
    public abstract String imprimir(String pref);

}
