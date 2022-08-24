package recuperatorio2022;

import java.util.ArrayList;

public class Autoparte extends ElementoAutoparte {
    private double peso, huellaCO2;
    private ArrayList<String> materiales;

    public Autoparte(String marca, double peso , double huellaCO2){
        super(marca);
        this.peso = peso;
        this.huellaCO2 = huellaCO2;
        this.materiales = new ArrayList<String>();
    }

    public double getPeso() {
        return peso;
    }

    public double getHuellaCO2() {
        return huellaCO2;
    }

    public ArrayList<String> getMateriales() {
        return new ArrayList<>(this.materiales);
    }

    public void addMateriales(String material){
        if(!materiales.contains(material)){
            materiales.add(material);
        }
    }

    @Override
    public ArrayList<ElementoAutoparte> buscarPor(Condicionbusqueda cond){
        ArrayList<ElementoAutoparte> salida  = new ArrayList<ElementoAutoparte>();
        if(cond.esCumplidaPor(this)){
            salida.add(this);
        }
        return salida;
    }

    public boolean tieneMaterial(String mat){
        return this.materiales.contains(mat);
    }
    
    public String toString(){
        String retorno =  "\nAutoparte: "+ super.getMarca()+" peso: "+this.getPeso()+" huella carbono: "+this.getHuellaCO2()+ "\nMateriales: ";
        int i =0;
        while(i < materiales.size()){
            retorno += materiales.get(i);
            if(i != materiales.size()){
                retorno += ",";
                i++;
            }
        }
        return retorno + "." ;
    }
}
