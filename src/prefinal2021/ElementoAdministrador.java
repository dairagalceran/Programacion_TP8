package prefinal2021;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoAdministrador {
    
    public abstract ArrayList<Marcador> buscarPor(CondicionBusqueda cond);
    public abstract ElementoAdministrador getCopia();
    public abstract ElementoAdministrador getCopiaRestringida(CondicionBusqueda cond);
    public abstract String  imprimir(String pref);
    
    public  abstract int contarCantidadMarcadores();
    public abstract ArrayList<String> getPalabrasClaves();

    public  int cantidadPalabrasClaves(){
        return this.getPalabrasClaves().size();
    }



    public  ArrayList<Marcador> buscarPor(CondicionBusqueda cond, Comparator<Marcador> orden){
        ArrayList<Marcador> salida = buscarPor(cond);
        Collections.sort(salida, orden);
        return salida;
    }

}
