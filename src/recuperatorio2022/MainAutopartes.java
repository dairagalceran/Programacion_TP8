package recuperatorio2022;

import java.util.ArrayList;
import java.util.Comparator;

public class MainAutopartes {
    public static void main(String[] args) {
        EmpresaNoticias empresa = new EmpresaNoticias();

        Autoparte at1 = new Autoparte("ford", 35.60, 120);
        Autoparte at2 = new Autoparte("rendell", 120, 950.59);
        Autoparte at3 = new Autoparte("tito", 359.90, 290.90);
        Autoparte at4 = new Autoparte("rendell", 220, 370.59);
        Autoparte at5 = new Autoparte("tito", 280, 220);

        at1.addMateriales("hierro");
        at1.addMateriales("aluminio");
        at1.addMateriales("cinc");
        at2.addMateriales("aluminio");
        at2.addMateriales("acero");
        at3.addMateriales("cobalto");
        at3.addMateriales("hierro");

        AutoparteCompuesta comp1 = new AutoparteCompuesta("tito");

        comp1.addElementos(at1);
        comp1.addElementos(at3);
        comp1.addElementos(at2);
        comp1.addElementos(at5);

        System.out.println(at3);
        System.out.println(at2);
        System.out.println(comp1);
        
        empresa.addAutopartes(comp1);
        empresa.addAutopartes(at1);
        empresa.addAutopartes(at2);
        empresa.addAutopartes(at3);
        empresa.addAutopartes(at4);
        empresa.addAutopartes(at5);
        
        System.out.println("------ ordenar-------");
        OrdenarPorHuellaCO2 ordenHuella = new OrdenarPorHuellaCO2();
        OrdenarPorMarca ordenMarca = new OrdenarPorMarca();
        OrdenarPorPeso ordenPeso = new OrdenarPorPeso();
        OrdenarDoble ordenDoble = new OrdenarDoble(ordenMarca, ordenPeso);
       // System.out.println(empresa);
        System.out.println();
        System.out.println("------- buscar marca -------");
        Condicionbusqueda bucarMarca = new BuscarPorMarca("tito");
        ArrayList<ElementoAutoparte> aux = new ArrayList<>();
        aux = empresa.buscarPor(bucarMarca,ordenHuella);
        System.out.println(aux);
        System.out.println();
        System.out.println("------- buscar peso menor -------");
        Condicionbusqueda pesoMenorA = new BuscarPesoInferior(400);
        System.out.println(empresa.buscarPor(pesoMenorA,ordenMarca));
        System.out.println();
        System.out.println("------- buscar huella CO2 mayor a  -------");
        Condicionbusqueda huellaMayorA = new BuscarHuellaSuperiorA(300);
        System.out.println(empresa.buscarPor(huellaMayorA, ordenMarca));
        System.out.println();
        System.out.println("------- buscar AND  -------");
        Condicionbusqueda and = new CondicionBusquedaAND(pesoMenorA ,huellaMayorA );
        System.out.println(empresa.buscarPor(and, ordenMarca));
        System.out.println();
        System.out.println("------ buscar material ----------");
        Condicionbusqueda bucarMaterial = new BuscarPorMaterial("aluminio");
        System.out.println(empresa.buscarPor(bucarMaterial, ordenMarca));
        System.out.println("-------- buscar peso menos ordenados pos marca y peso");
        ArrayList<ElementoAutoparte> salidaOrdenada = empresa.buscarPor(pesoMenorA, ordenDoble);
        System.out.println(salidaOrdenada);

    }
}
