package recuperatorio2022;

import java.util.ArrayList;

public abstract class ElementoAutoparte {
    
    private String marca;

    public ElementoAutoparte(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double getPeso();
    public abstract ArrayList<String> getMateriales();
    public abstract double getHuellaCO2();
    public abstract ArrayList<ElementoAutoparte> buscarPor(Condicionbusqueda cond);


    public String toString(){
        return "Marca: "+this.getMarca();
    }

}

