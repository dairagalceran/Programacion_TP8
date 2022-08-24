package prefinal2021;

import parcial2022.BusquedaPorColor;

public class BusquedaPorNombreUsuario  extends CondicionBusqueda{
    private String buscarNombre;

    public BusquedaPorNombreUsuario(String buscarNombre){
        this.buscarNombre = buscarNombre;
    }

    public boolean esCumplidaPor(Marcador mcd){
        return mcd.getUsuarioNombre().equalsIgnoreCase(this.buscarNombre);
    }
}
