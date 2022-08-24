package parcial2021_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Combo extends ElementoAlquiler {

    private ArrayList<ElementoAlquiler> elementos;

    public Combo(int id){
        super(id);
        this.elementos = new ArrayList<>();
    }

    public  double getValor(){
        int suma =0;
        for(int i= 0; i < elementos.size(); i++){
            suma += elementos.get(i).getValor();
        }
        return suma;
    }

    public int getAntiguedad(){
        int mayorAnt = 0;
        for(int i =0; i < elementos.size(); i++){
            int aux = elementos.get(i).getAntiguedad();
            if( aux > mayorAnt){
                mayorAnt = aux;
            }
        }
        return mayorAnt;
    }

    public void addElemento(ElementoAlquiler el){
        if(!elementos.contains(el)){
            elementos.add(el);
        }
    }

    public ArrayList<ElementoAlquiler> getElementos(){
        return new ArrayList<ElementoAlquiler>(elementos);
    }

    public  double getCosto(){
        double costoTotal = 0;
        for(int i = 0; i < elementos.size(); i++){
            costoTotal += elementos.get(i).getCosto();
        }
        return costoTotal;
    }

    @Override
    public String getDescripcion() {
        return null;
    }

    public String toSting(){
        String retorno = "Combo id : "+ super.getId()+" , valor: "+this.getValor()+", antiguedad: "+this.getAntiguedad()+"\n[";
        int i = 0;
        while(i < elementos.size()){
            retorno += elementos.get(i).toString();
            i++;
        }
        return retorno+ " ]";
    }

}
