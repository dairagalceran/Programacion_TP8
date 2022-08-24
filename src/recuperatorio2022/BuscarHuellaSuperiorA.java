package recuperatorio2022;

public class BuscarHuellaSuperiorA extends Condicionbusqueda{
    private double valorHuellaCO2;

    public BuscarHuellaSuperiorA(double valorHuellaCO2){
        this.valorHuellaCO2 = valorHuellaCO2;
    }

    public boolean esCumplidaPor(ElementoAutoparte el){
        return el.getHuellaCO2() > this.valorHuellaCO2;
    }
}
