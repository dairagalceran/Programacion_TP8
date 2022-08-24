package tp8_ej1_Futbol5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club  {

    private String nombre;    
    private ArrayList<Socio> socios;
   // private ArrayList<Alquiler> alquilerCanchas;

    public Club (String nombre){
        this.nombre = nombre;
        this.socios = new ArrayList<>();
       // this.alquilerCanchas = new ArrayList<>();
    }

    /*public void addAlquilerCancha(Alquiler alq){
        if(!alquilerCanchas.contains(alq)){
            alquilerCanchas.add(alq);
        }
    }*/

    public void addSocio(Socio clNuevo){
        if(!socios.contains(clNuevo))
        socios.add(clNuevo);    
    }

    public ArrayList<Socio> getSocio(){
        return new ArrayList <Socio>(socios) ;
    }


    /*public ArrayList<Socio> ordenar(Comparator orden){
        ArrayList sociosOrdenados = getSocio();
        Collections.sort(sociosOrdenados , orden);
    }*/
        
    public ArrayList<Socio> buscarSociosQueCumplan(CondicionBusqueda condicion){
        ArrayList<Socio> auxSocio = new ArrayList<>();
        for(int i =0; i<socios.size(); i++){
            Socio sc = socios.get(i);
            if(condicion.esCumplidaPor(sc)){
                auxSocio.add(sc);
            }
        }
        return auxSocio;
    }
    public ArrayList<Socio> buscarSociosQueCumplan(CondicionBusqueda condicion, Comparator<Socio> orden){
        ArrayList<Socio> auxSocio = new ArrayList<>();
        for(int i =0; i<socios.size(); i++){
            Socio sc = socios.get(i);
            if(condicion.esCumplidaPor(sc)){
                auxSocio.add(sc);
            }
        }
        Collections.sort(auxSocio, orden);
        return auxSocio;
    }
    
    @Override
    public String toString(){
        return this.toString();
    }
   

}
