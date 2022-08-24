package recuperatorio2022;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpresaNoticias {

    private ArrayList<ElementoAutoparte> autopartes;
    //private Condicionbusqueda politica;

    public EmpresaNoticias (){
        this.autopartes = new ArrayList<>();
    }

    /*public void addAutopartes(ElementoAutoparte el){
        if(politica.esCumplidaPor(el)){
            autopartes.add(el);
        }
    }
    */

    public void addAutopartes(ElementoAutoparte el){
        if(!autopartes.contains(el)){
            autopartes.add(el);
        }
    }
    
    public ArrayList<ElementoAutoparte> getAutopartes(){
        return this.autopartes;
    }

    
    public ArrayList<ElementoAutoparte> buscarPor(Condicionbusqueda cond){
        ArrayList<ElementoAutoparte> salida = new ArrayList<>();
        for(int i = 0; i < autopartes.size(); i++){
            salida.addAll(autopartes.get(i).buscarPor(cond));
        }
        return salida;
    }
    
    public ArrayList<ElementoAutoparte> buscarPor(Condicionbusqueda cond, Comparator<ElementoAutoparte> orden){
        ArrayList<ElementoAutoparte> salida = buscarPor(cond);
        Collections.sort(salida, orden);
        return salida;
    }
    
}
