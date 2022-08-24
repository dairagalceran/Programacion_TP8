package parcial2021;
import java.util.ArrayList;

public abstract class ElementoVenta {
    private String nombre;

    public ElementoVenta(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract double getVolumen();
    public abstract String getMarca();
    public abstract int contarProductos();
    public abstract ArrayList<ElementoVenta> buscarPor(Buscador condicion);

        @Override
        public boolean equals(Object o){
            try {
                ElementoVenta otro = (ElementoVenta)o; //funciona porque tanto prod como kit son un elemento de Venta
                return otro.getNombre().equals(this.nombre);
            } catch (Exception e) {
                return false;
            }
        }

    @Override
    public String toString(){
        return "Producto/kit/paquete nombre: "+this.getNombre();
    }
}

