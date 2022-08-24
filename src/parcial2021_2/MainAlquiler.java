package parcial2021_2;

import java.time.LocalDate;

import parcial2021_2.calculadorAlquiler.CalculadorAlquiler;
import parcial2021_2.calculadorAlquiler.CalcularCostoConPorcentaje;
import parcial2021_2.calculadorAlquiler.CalcularCostoFijo;
import parcial2021_2.condicionesBusqueda.BusquedaContienePalabraEnDescripcion;
import parcial2021_2.condicionesBusqueda.BusquedaPorIdentificador;
import parcial2021_2.condicionesBusqueda.BusquedaValorMenorA;
import parcial2021_2.condicionesBusqueda.CondicionBusqueda;

public class MainAlquiler {
    
    public static void main(String[] args) {
        Articulo art1 = new Articulo(1,  230, "cortador de madera circular ");
        Articulo art2 = new Articulo(2,  170, "caladora de madera circular ");
        Articulo art3 = new Articulo(3,  290, "sierra de madera circular ");
        Articulo art4 = new Articulo(4, 250, "cortadora cesped motor ");
        Articulo art5 = new Articulo(5, 125, "casa quinta circuito");
        Articulo art6 = new Articulo(6, 196, "departamento");
        Articulo art7 = new Articulo(7,  130, "mesa redonda");

        Combo herramientas = new Combo(001);
        herramientas.addElemento(art1);
        herramientas.addElemento(art2);
        herramientas.addElemento(art4);
        herramientas.addElemento(art3);

        Combo inmuebles = new Combo(002);
        inmuebles.addElemento(art5);
        inmuebles.addElemento(art6);

        EmpresaAlquiler empresa = new EmpresaAlquiler();
        empresa.addAlquiler(art1);
        empresa.addAlquiler(art7);
        empresa.addAlquiler(art6);
        empresa.addAlquiler(art5);
        empresa.addAlquiler(art2);
        empresa.addAlquiler(art3);
        empresa.addAlquiler(art1);
        empresa.addAlquiler(art4);
        
        Articulo artDepr1 = new ElementoDeprecated(00, 1200, "serruv¡cho", -4, 2);
        herramientas.addElemento(artDepr1);
        
        //System.out.println(art1.getCosto());
        System.out.println(art1.getId());
        System.out.println(art1.getFcIngreso());
        System.out.println(art1.getAntiguedad());
        System.out.println(art1);

        System.out.println();
        System.out.println(inmuebles.getElementos());
        System.out.println();
        System.out.println(herramientas.getElementos());
        System.out.println( artDepr1.toString());
        System.out.println();
        System.out.println(empresa.getAlquileres());
        System.out.println("--busqueda---");
        BusquedaContienePalabraEnDescripcion buscarContiene = new BusquedaContienePalabraEnDescripcion("de");
        System.out.println(empresa.buscarPor(buscarContiene));
        System.out.println();

        CondicionBusqueda buscarId = new BusquedaPorIdentificador(1);
        System.out.println(empresa.buscarPor(buscarId));
        System.out.println();

        CondicionBusqueda buscarValorMenor = new BusquedaValorMenorA(200.00);
        System.out.println(empresa.buscarPor(buscarValorMenor));
        System.out.println();

        CalculadorAlquiler costoFijo = new CalcularCostoFijo(23);
        art5.setCalcularAlquiler(costoFijo);
        System.out.println(art5.getCosto());
    }
}
