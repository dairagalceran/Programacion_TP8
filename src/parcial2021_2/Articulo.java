package parcial2021_2;
import parcial2021_2.calculadorAlquiler.*;
import parcial2021_2.condicionesBusqueda.*;
import java.time.LocalDate;
import java.time.Period;

public class Articulo extends ElementoAlquiler{
    private double valor;
    private String descripcion;
    private CalculadorAlquiler calcularAlquiler;

    public Articulo(int id,  double valor, String descripcion){
        super(id);
        this.valor = valor;
        this.descripcion = descripcion;
        this.calcularAlquiler = calcularAlquiler;
    }

    public int getAntiguedad(){
        LocalDate hoy = LocalDate.now();
        LocalDate entrada = super.getFcIngreso();
        Period meses = Period.between(entrada , hoy);
        return meses.getMonths();
    }

    public void setCalcularAlquiler(CalculadorAlquiler calculoAlquiler) {
        this.calcularAlquiler = calcularAlquiler;
    }

    public  double getCosto(){
        return  this.calcularAlquiler.calcularCostoAlquiler();
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String toString(){
        return "Artículo id: "+ super.getId()+", valor: "+this.getValor() + ", descripción: "+this.getDescripcion()+ ", antiguedad: "+this.getAntiguedad()+"\n";
    }
    
}
