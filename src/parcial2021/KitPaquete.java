package parcial2021;

import java.util.ArrayList;

public class KitPaquete  extends ElementoVenta{

    private ArrayList<ElementoVenta>  kits;


    public KitPaquete(String nombre){
        super(nombre);
        this.kits= new ArrayList<ElementoVenta>();
    }

    public void addProductoPaquete(ElementoVenta nuevoE){ // redefinir el equals en elementoVenta para comparar Product o combo
            kits.add(nuevoE);
    }

    @Override
    public double getVolumen(){
        double mayorVol = 0 ;
        for(int i = 0; i< kits.size();i++){
            double aux = kits.get(i).getVolumen();
            if(aux > mayorVol){
                mayorVol = aux;
            }
        }
        return mayorVol;
    }
    
    @Override
    public int contarProductos(){
        int cant = 0;
        for(int i =0; i< kits.size(); i++){
            cant+= kits.get(i).contarProductos();
        }
        return cant;
    }

    @Override
    public double getPrecio(){
        double precio=0.0;
        for(int i = 0; i< kits.size(); i++){
            precio+= kits.get(i).getPrecio();
        }
        return precio;
    }

    @Override
    public String getMarca(){
        if(kits.size()>0){
            return kits.get(0).getMarca();
        }
        return null;
    }

    @Override
    public ArrayList<ElementoVenta> buscarPor(Buscador cond){
        ArrayList<ElementoVenta> salida = new ArrayList<>();
        if(cond.esCumplidaPor(this)){
            salida.add(this);
        }
        for(int i =0;i < kits.size(); i++){
            salida.addAll(kits.get(i).buscarPor(cond));
        }
        return salida;
    }

    @Override
    public String toString(){
        String retorno = super.getNombre()+"[ ";
        int i = 0;
        while(i < kits.size()){
            retorno += kits.get(i).toString();
            i++;
        }
        return retorno + "]";
    }
    
    @Override
    public boolean equals(Object o){
        ElementoVenta otro = (ElementoVenta)o;
        return otro.getMarca().equals(this.getMarca());
    }
}
