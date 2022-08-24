package parcial2021;

import java.util.ArrayList;

public class Producto extends ElementoVenta{
    
    private double volumen, precio;
    private String marca;

    public Producto(String nombre, double volumen, double precio, String marca){
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
    }
   
    
    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double getVolumen(){
        return this.volumen;
    }

    @Override
    public int contarProductos(){
        return 1;
    }

    @Override
    public ArrayList<ElementoVenta> buscarPor(Buscador condicion){
        ArrayList<ElementoVenta> salida = new ArrayList<>();
            if(condicion.esCumplidaPor(this)){
                salida.add(this); 
            }
        return salida;
    }

    @Override
    public boolean equals(Object o){
        ElementoVenta otro = (ElementoVenta)o;
        return otro.getMarca().equals(this.getMarca());
    }
    
    @Override
    public String toString(){
        return "\n"+super.toString()+
            "\n marca: "+this.getMarca()+" precio:  $ "+this.getPrecio()+
            "  volumen(cm3): "+this.getVolumen()+" \n";
    }
}
