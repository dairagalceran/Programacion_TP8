package ordenamiento.condiciones;
import ordenamiento.Persona;

public class CondiApellido extends Condicion{
    
    String apellido;

    public CondiApellido(String apellido){
        this.apellido = apellido;
    }

    @Override
    public boolean  cumple(Persona p){
        return  p.getApellido().equalsIgnoreCase(apellido);
    }
}
