package tp8_ej1_Futbol5;
import java.time.LocalDate;

public class Alquiler {

    private LocalDate fechaAlquiler;
    private int idCancha;
    private double pagoAlquiler;

        public Alquiler (int idCancha, LocalDate fechaAlquiler, double pagoAlquiler){
        this.idCancha = idCancha;
        this.fechaAlquiler = fechaAlquiler;
        this.pagoAlquiler = pagoAlquiler;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public double getPagoAlquiler() {
        return pagoAlquiler;
    }

        public String toSttring(){
            return  "Alquiler:  cancha: "+this.getIdCancha()+" Fecha: "+this.getFechaAlquiler()+
                    "Precio: "+this.getPagoAlquiler();
        }


}
