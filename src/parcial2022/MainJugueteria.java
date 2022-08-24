package parcial2022;


public class MainJugueteria {
    public static void main(String[] args) {
        Jugueteria lib = new Jugueteria();

        Pieza ladrillito = new Pieza("rasti", "azul", 100.20, 3, 13);
        Pieza ladrillito4 = new Pieza("rasti", "rojo", 100.20, 3.2, 13);
        Pieza ladrillito3 = new Pieza("rasti", "verde", 100.20, 1.3, 15);
        Pieza ladrillito2 = new Pieza("rasti", "amarillo", 70.20, 3.4, 13);
        System.out.println("ladrillito: color "+ ladrillito.getColor());
        System.out.println("ladrillito2 costo "+ladrillito2.getCosto());
        System.out.println("ladrillito3 marca "+ladrillito3.getMarca());

        ConjuntoPieza combo1 = new ConjuntoPieza("rasti", 15);
        combo1.addPiezasAlCombo(ladrillito);
        combo1.addPiezasAlCombo(ladrillito2);
        combo1.addPiezasAlCombo(ladrillito3);
        combo1.addPiezasAlCombo(ladrillito4);
        combo1.addPiezasAlCombo(ladrillito2);
        
        
       // combo1.addPiezasAlCombo(combo1);
        System.out.println("-------combo 1---------");
        System.out.println(combo1.getComboPaquete());
        System.out.println("----------------");
        System.out.println("marao combo "+ combo1.getMarca());
        System.out.println("peso combo "+ combo1.getPeso());
        System.out.println("encastres combo  "+combo1.getCantidadEncastre());
        System.out.println("color combo "+ combo1.getColor());
        System.out.println("tamanio combo "+ combo1.getTamanio());
        System.out.println("costo combo 1 con "+combo1.getPorcentajeDescuento()+"% desc:  "+combo1.getCosto());

        ConjuntoPieza combo2 = new ConjuntoPieza("comi", 10);
        combo2.addPiezasAlCombo(combo1);
        combo2.addPiezasAlCombo(ladrillito3);

        System.out.println("-------- combo 2 --------");
        System.out.println(combo2.getComboPaquete());

        
        lib.addProductos(ladrillito2);
        lib.addProductos(ladrillito3);
        lib.addProductos(ladrillito4);
        lib.addProductos(ladrillito);
        lib.addProductos(combo1);
        lib.addProductos(ladrillito3);

        System.out.println("---Condiciones ------");
        CondicionBusqueda color = new BusquedaPorColor("azul");
        CondicionBusqueda peso = new BusquedaPorMenorPeso(3.1);
        System.out.println(lib.buscarPor(peso));

        System.out.println("-------Combo especial--------");
        CondicionBusqueda color1 = new BusquedaPorColor("rojo");
        CondicionBusqueda color2 = new BusquedaPorColor("amarillo");
        CondicionBusqueda or = new CondicionOR(color1, color2);
        CondicionBusqueda marca = new BusquedaPorMarca("Rasti");

        ComboEspecial cesp = new ComboEspecial("multimarca", 12, new BusquedaPorMenorCantidadEncastre(15));
        
        cesp.addPiezasAlCombo(ladrillito);
        cesp.addPiezasAlCombo(ladrillito4);
        cesp.addPiezasAlCombo(ladrillito2);
        cesp.addPiezasAlCombo(ladrillito3);
        

        System.out.println(cesp);
        System.out.println("----getProductos------");
        System.out.println(lib.getProductos());

    
        
    }
}
