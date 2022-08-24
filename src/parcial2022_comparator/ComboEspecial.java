package parcial2022_comparator;

public class ComboEspecial  extends ConjuntoPieza{

    private CondicionBusqueda aceptacion;

    public ComboEspecial(String marca, int porcentajeDescuento, CondicionBusqueda aceptacion){
        super(marca, porcentajeDescuento);
        this.aceptacion = aceptacion;
    }

    // HAY QUE SOBRE ESCRIBIR EL METODO DEL PADRE no se puede cambiar el nombre del metodo
    @Override
    public void addPiezasAlCombo(ElementoAdmin el){
        if(aceptacion.esCumplidaPor(el)){
            super.addPiezasAlCombo(el);
        }
    }

    public void setAceptacion(CondicionBusqueda aceptacion){
        this.aceptacion = aceptacion;
    }
    
    public CondicionBusqueda getAceptacion(){
        return this.aceptacion;
    }
}