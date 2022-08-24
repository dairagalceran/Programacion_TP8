package parcial2021;

public class MainLibreria {
    public static void main(String[] args) {

        Libreria lib = new Libreria("nombre");

        Producto p1 = new Producto("pord1", 230.50, 125.00, "faber");
        Producto p2 = new Producto("porod2", 400.50, 25.00, "mayer");
        Producto p4 = new Producto("pord4",  600, 225.00, "mayer");
        Producto p3 = new Producto("pord3", 300, 405.00, "cobra");

        KitPaquete kit1 = new KitPaquete(" paquete 1");
        kit1.addProductoPaquete(p3);
        kit1.addProductoPaquete(p1);
        kit1.addProductoPaquete(p2);

        KitPaquete kit2 = new KitPaquete("kit de kit");
        kit2.addProductoPaquete(kit1);
        kit2.addProductoPaquete(p3);
        kit2.addProductoPaquete(p2);
        
        
        lib. addProductos(p1);
        lib. addProductos(p2);
        lib. addProductos(p3);
        lib. addProductos(p4);
        lib.addProductos(p2);
        lib.addProductos(kit1);
        lib.addProductos(kit2);
        lib.addProductos(p4);

        System.out.println("-------p4---------");
        System.out.println("producto " + p4);
        System.out.println("-------kit1-------");
        System.out.println(kit1);

        System.out.println("--------agrego productos en kit------");
        kit1.addProductoPaquete(p4);
        System.out.println(kit1);
        System.out.println("precio kit 1 "+kit1.getPrecio());


        System.out.println("------ contar productos  kit 2-------");       
        System.out.println(kit2.contarProductos());
        System.out.println("---kit 2 -   - - - ");
        System.out.println(kit2);
        System.out.println();
        System.out.println();
        System.out.println("---Buscador----");
        Buscador marca = new BuscadorPorMarca("mayer");
        System.out.println("------buscar por marca ------");               
        System.out.println(lib.buscarPor(marca));
        System.out.println();
        System.out.println("------buscar por menor precio ------");  
        Buscador menorPrecio = new BuscadorPorMenorPrecio(500);
        System.out.println(lib.buscarPor(menorPrecio));
        System.out.println();
        System.out.println("------buscar por menor pvolumen ------"); 
        Buscador menorVolumen = new BuscadorPorMenorVolumen(700 );
        System.out.println(lib.buscarPor(menorVolumen));
        System.out.println();
        System.out.println("------buscar por mayor precio ------"); 
        Buscador mayorPrecio = new BuscadorPorMayorPrecio(300 );
        System.out.println(lib.buscarPor(mayorPrecio));
        System.out.println();
        System.out.println("------buscar con AND------"); 
        Buscador and = new CondicionAND(menorVolumen, marca);
        System.out.println(lib.buscarPor(and));
    }
}
