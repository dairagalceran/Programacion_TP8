package tp8_ej6_Arbol;

public class Empleado extends Persona implements Comparable<Empleado>{

    private int legajo;
    private double sueldo;
    
    public Empleado(String nombre, String apellido,  int dni, int legajo, double sueldo ){
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int compareTo(Empleado empl){
        if(this.getLegajo() > empl.getLegajo()){
            return 1;
        }else{
            if(this.getLegajo() < empl.getLegajo()){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString(){
        return  super.toString() +", legajo: "+this.getLegajo()+", sueldo: $"+this.getSueldo()+"\n";
    }
}
