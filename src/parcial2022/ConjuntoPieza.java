package parcial2022;

import java.util.ArrayList;

public class ConjuntoPieza extends ElementoAdmin {
    
    private ArrayList<ElementoAdmin> comboPaquete;
    private int porcentajeDescuento;

    public ConjuntoPieza(String marca, int porcentajeDescuento){
        super(marca);
        this.comboPaquete = new ArrayList<>();
        this.porcentajeDescuento = porcentajeDescuento;

    }

    public int getPorcentajeDescuento() {
        return this.porcentajeDescuento;
    }

    public ArrayList<ElementoAdmin> getComboPaquete() {
        return new ArrayList<ElementoAdmin>(this.comboPaquete);
    }

    public void addPiezasAlCombo(ElementoAdmin el){
        this.comboPaquete.add(el);
    }

    public int getTamanio(){
        return comboPaquete.size();
    }

    @Override
    public String getColor() {
        if(comboPaquete.size()>0){
            return comboPaquete.get(getTamanio()-1).getColor();
        }
        return null;
    }

    @Override
    public double getPeso(){
        double suma = 0;
        for (int i = 0; i< comboPaquete.size(); i++){
            suma += comboPaquete.get(i).getPeso();
        }
        return suma;
    }

    @Override
    public int getCantidadEncastre(){
        int suma =0;
        for (int i =0; i < comboPaquete.size(); i++){
            suma += comboPaquete.get(i).getCantidadEncastre();
        }
        if(comboPaquete.size()>0)
            return (int)(suma/comboPaquete.size());
        else
            return 0;
    }

    @Override
    public double getCosto(){
        double suma =0;
        for(int i =0; i < comboPaquete.size(); i++){
            suma += comboPaquete.get(i).getCosto();
        }
        return suma - suma*porcentajeDescuento/100;
    }

    @Override
    public ArrayList<ElementoAdmin>  buscarPor(CondicionBusqueda cond){
        ArrayList<ElementoAdmin> salida = new ArrayList<ElementoAdmin>();
        if(cond.esCumplidaPor(this)){
            salida.add(this);
        }
        for (int i =0; i < comboPaquete.size(); i++){
            ElementoAdmin aux = comboPaquete.get(i);
            salida.addAll(aux.buscarPor(cond));
        }
        return salida;
    }


    @Override
    public String toString(){
        String retorno = "Combo marca: "+ super.getMarca()+ "Piezas: "; 
        int i = 0;
        while(i < comboPaquete.size()){
            retorno += comboPaquete.get(i).toString();
            i++;
        }
        return retorno + "]";
    }
    

}
