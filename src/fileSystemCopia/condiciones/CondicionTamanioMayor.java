package fileSystemCopia.condiciones;

import fileSystemCopia.ElementoFS;

public class CondicionTamanioMayor extends Condicion{
    private double tamanioMinimo;

    public CondicionTamanioMayor(double tamanioMinimo) {
        this.tamanioMinimo = tamanioMinimo;
    }

    @Override
    public boolean cumple(ElementoFS elemento){
        return elemento.getTamanio()>this.tamanioMinimo;
    }
}
