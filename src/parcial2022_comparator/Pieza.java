package parcial2022_comparator;

import java.util.ArrayList;

public class Pieza extends ElementoAdmin {
    private String color;
    private double costo, peso;
    private int cantidadEncastre;

    public Pieza(String marca, String color, double costo, double peso, int cantidadEncastre ){
        super(marca);
        this.color = color;
        this.cantidadEncastre = cantidadEncastre;
        this.costo = costo;
        this.peso = peso;
    }
    @Override
    public ArrayList<ElementoAdmin>  buscarPor(CondicionBusqueda cond){
        ArrayList<ElementoAdmin> salida = new ArrayList<>();
        if(cond.esCumplidaPor((this))){
            salida.add(this);
        }
        return salida;
    }
    @Override
    public ElementoAdmin getCopia(){
        Pieza copia = new Pieza(this.getColor(), this.getMarca(), this.getCosto(), this.getPeso(), this.getCantidadEncastre());
        return copia;
    }

    @Override
    public int getCantidadEncastre() {
        return this.cantidadEncastre;
    }

    public void setCantidadEncastre(int cantidadEncastre) {
        this.cantidadEncastre = cantidadEncastre;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getCosto(){
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public  double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "\nMarca: "+ super.getMarca()+ "Color: "+ this.getColor()+
                " Cantidad encastres: "+ this.getCantidadEncastre()+
                " Peso: "+ this.getPeso()+ "Costo: "+this.getCosto()+"\n";
    }
}
