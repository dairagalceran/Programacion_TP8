package prefinal2021;
import java.util.Comparator;

public class ComparadorUrl implements Comparator<Marcador>{

    public int compare(Marcador mcd1, Marcador mcd2){
        return mcd1.getUrl().compareTo(mcd2.getUrl());
    }
    
}
