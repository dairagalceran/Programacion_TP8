package parcial2021;
public class BuscadorPorMenorVolumen extends Buscador {
    private double volumen;

    public BuscadorPorMenorVolumen(double  volumen){
        this.volumen = volumen;
    }

    @Override
    public boolean esCumplidaPor(ElementoVenta el){
        return  el.getVolumen() < volumen;
    }
}
