package parcial2021_2;

import java.time.LocalDate;
import java.util.ArrayList;

import parcial2021_2.condicionesBusqueda.CondicionBusqueda;
import parcial2021_2.calculadorAlquiler.*;

public abstract class ElementoAlquiler implements Comparable<ElementoAlquiler>{

    private int id;
    private LocalDate fcIngreso;

    public ElementoAlquiler(int id){
        this.id = id;
        this.fcIngreso = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public LocalDate getFcIngreso() {
        return fcIngreso;
    }

    public abstract double getValor();
    public abstract int  getAntiguedad();
    public abstract String getDescripcion();
    public abstract double getCosto();

    public int compareTo(ElementoAlquiler elAlq){
        int resultado = this.id - elAlq.getId();
        if( resultado == 0){
            resultado = this.getAntiguedad() - (elAlq.getAntiguedad());
            return resultado;
        }else{
            return resultado;
        }
    }

    public String toString(){
        return "id: "+ this.getId()+ " fecha ingreso: "+this.getFcIngreso();
    }

}