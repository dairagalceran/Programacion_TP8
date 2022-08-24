package fileSystem7.condiciones;

import fileSystem7.Archivo;

public class CondicionTamanioMayor extends Condicion{
    private double tamanioMinimo;

    public CondicionTamanioMayor(double tamanioMinimo) {
        this.tamanioMinimo = tamanioMinimo;
    }

    @Override
    public boolean cumple(Archivo archivo){
        return archivo.getTamanio()>this.tamanioMinimo;
    }
}
