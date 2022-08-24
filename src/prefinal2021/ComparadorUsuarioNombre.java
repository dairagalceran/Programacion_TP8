package prefinal2021;
import java.util.Comparator;

public class ComparadorUsuarioNombre implements Comparator<Marcador>{

    public int compare(Marcador mcd1 , Marcador mcd2){
        return mcd1.getUsuarioNombre().compareTo(mcd2.getUsuarioNombre());
    }
    
}
