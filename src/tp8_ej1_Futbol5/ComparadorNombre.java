package tp8_ej1_Futbol5;
import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio>{
    
    @Override
    public int compare(Socio sc1 , Socio sc2){
        return sc1.getNombre().compareTo(sc2.getNombre());
    }
}
