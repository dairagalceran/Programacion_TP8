package tp8_ej1_Futbol5;
import java.util.Comparator;

public class ComparadorDoble implements Comparator<Socio> {
    
    private Comparator<Socio> sc1;
    private Comparator<Socio> sc2;

    public ComparadorDoble (Comparator<Socio> sc1, Comparator<Socio> sc2){
        this.sc1 = sc1;
        this.sc2 = sc2;
    }

    @Override
    public int compare(Socio s1 ,  Socio s2){
        int result = sc1.compare(s1 , s2);
        if(result ==0){
            result = sc2.compare(s1, s2);
        }
        return result;
    }
}
