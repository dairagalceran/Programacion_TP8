package tp8_ej1_Futbol5;
import java.util.Comparator;

public class ComparadorCantidadTotalCanchaX  implements Comparator<Socio>{
    
    @Override
    public int compare(Socio s1, Socio s2){
        return s1.cantidadAlquilerCanchaNumero(idBuscar) - s2.cantidadAlquilerCanchaNumero(idBuscar);
    }
}
