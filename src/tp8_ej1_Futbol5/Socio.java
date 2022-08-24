package tp8_ej1_Futbol5;
import java.time.*;
import java.util.ArrayList;

public class Socio  {

    private String nombre , apellido;
    private LocalDate fechaNac;
    private boolean ultimaCuotaPaga;
    private ArrayList<Alquiler> alquileresSocio;
    private int edad;
    
    public Socio(String nombre,String  apellido,LocalDate fechaNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.ultimaCuotaPaga =  false;
        this.alquileresSocio = new ArrayList<>();
        this.edad= calcularEdad();
    }    
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac(){
        return this.fechaNac;
    }
    public int getEdad(){
        return this.edad;
    }

    public void  setEdad(){
        this.edad = calcularEdad();
    }
    
    public void setUltimaCuotaPaga(boolean ultimaCuotaPaga) {
        this.ultimaCuotaPaga = ultimaCuotaPaga;
    }
    
    public boolean estaAlDia(){
        return this.ultimaCuotaPaga;
    }

    public boolean pagoMasDe(double pago){
        for(int i =0; i < alquileresSocio.size();i++){
            if(alquileresSocio.get(i).getPagoAlquiler() > pago){
                return true;
            }
        }
        return false;
    }

    public int calcularEdad(){
        if(fechaNac != null){
            int edad = Period.between(fechaNac , LocalDate.now()).getYears();
            return edad;
        }
        return 0;
    }

    public void addAlquiler(Alquiler alq){
        if(!alquileresSocio.contains(alq)){
            alquileresSocio.add(alq);
        }
    }

    public boolean alquiloCancha(int idBuscar){
        for (int i =0; i< alquileresSocio.size();i++){
        if(alquileresSocio.get(i).getIdCancha() == idBuscar)
            return true;
        }
        return false;    
    }
    public int cantidadAlquilerCanchaNumero(int idBuscar){
        if(alquiloCancha(idBuscar)){
            int cant = 0;
            for(int i =0; i<alquileresSocio.size(); i++){
                if(alquileresSocio.get(i).getIdCancha() == idBuscar)
                    cant++;
            }
            return cant;
        }
        return 0;
    }

    
    @Override
    public String toString(){
        return "Socio: [ Nombre y apellido: "+ this.getNombre()+" "+this.getApellido()+
                ", Edad: "+ this.getEdad()+ " años\n";
    }

    @Override
    public boolean equals(Object o){
        try {
            Socio otro = (Socio)o;
            return this.getNombre().equals(otro.getNombre()) && this.getApellido().equals(otro.getApellido());
        } catch (Exception e) {
            return false;
        }
    }
}
