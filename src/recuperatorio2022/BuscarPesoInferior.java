package recuperatorio2022;

public class BuscarPesoInferior extends Condicionbusqueda {
    private double valorPeso;

    public BuscarPesoInferior(double valorPeso){
        this.valorPeso = valorPeso;
    }

    public boolean esCumplidaPor(ElementoAutoparte el){
        return el.getPeso() < this.valorPeso;
    }
}
