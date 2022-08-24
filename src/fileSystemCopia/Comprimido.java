package fileSystemCopia;

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
    
    @Override
    protected Carpeta instanciar() {
    	return new Comprimido(this.getNombre(), this.getTasaCompresion());
    }
    
    /*@Override
    public ElementoFS getCopia() {
    	Comprimido copia = new Comprimido(this.getNombre(), this.getTasaCompresion());
    	
    	for (int i = 0; i < this.elementos.size(); i++)
			//copia.agregarElemento(this.elementos.get(i)); // Esto no copia en profundidad!
			copia.agregarElemento(this.elementos.get(i).getCopia());
    	
    	return copia;
    }*/
}
