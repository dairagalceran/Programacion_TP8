package recuperatorio2022;
import java.util.ArrayList;

public class AutoparteCompuesta extends ElementoAutoparte {

    private ArrayList<ElementoAutoparte> elementos;

    public AutoparteCompuesta(String marca){
        super(marca);
        this.elementos = new ArrayList<ElementoAutoparte>();
    }

    public void addElementos(ElementoAutoparte el){
        elementos.add(el);
    }
    
    public  double getPeso(){
        double pesoTotal = 0;
        for(int i =0; i< elementos.size(); i++){
            pesoTotal += elementos.get(i).getPeso();
        }
        return pesoTotal;
    }

    public ArrayList<String> getMateriales(){
        ArrayList<String> materialesSinRepetir = new ArrayList<String>();
        for(int i = 0; i < this.elementos.size(); i ++){
            ElementoAutoparte el = this.elementos.get(i);
            ArrayList<String> aux = el.getMateriales();
            for(int j =0; j < aux.size(); j++){
                if(!materialesSinRepetir.contains(aux.get(j))){
                    materialesSinRepetir.add(aux.get(j));
                }
            }
        }
        return materialesSinRepetir;
    }

        public void imprimirMateriales(){
            ArrayList<String> materialesSinRepetir = getMateriales();
            System.out.println(materialesSinRepetir);
        }
        
    public  double getHuellaCO2(){
        double mayorValor = 0;
        for(int i = 0; i < this.elementos.size(); i ++){
            double aux = elementos.get(i).getHuellaCO2();
            if(aux > mayorValor){
                mayorValor = aux;
            }
        }
        return mayorValor;
    }
    
    public ArrayList<ElementoAutoparte> buscarPor(Condicionbusqueda cond){
        ArrayList<ElementoAutoparte> salida = new ArrayList<>();
        if(cond.esCumplidaPor(this)){
            salida.add(this);
        }
        else{
            for(int i= 0; i< this.elementos.size(); i++){
                ElementoAutoparte elAuti = this.elementos.get(i);
                salida.addAll(elAuti.buscarPor(cond));
            }
        }
        return salida;
    }


    public String toString(){
        return "\n"+super.getMarca()+" Peso total: "+this.getPeso()+", huella carbono: "+this.getHuellaCO2()+"\nMateriales: ";
        
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Autoparte otro = (Autoparte) o; //Esto puede fallar si me quieren comparar una carpeta con un comprimido con los mismos nombres
            return this.getMateriales().equals(otro.getMateriales());
        } catch (Exception e){
            return false;
        }
    }
}
