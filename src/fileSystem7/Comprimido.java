package fileSystem7;

public class Comprimido extends Carpeta{
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Comprimido otro = (Comprimido) o;
            return this.getNombre().equals(otro.getNombre()) ;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Comprimido al "+(this.getTasaCompresion()*100)+"% de "+super.toString();
    }
}
