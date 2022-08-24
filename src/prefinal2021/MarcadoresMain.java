package prefinal2021;
public class MarcadoresMain {
    public static void main(String[] args) {
        
        Marcador mcd1 = new Marcador("estilo", "www.estilo.google.com", "ester");
        Marcador mcd2 = new Marcador("pintura", "www.pinturaGotica.unicen.com", "delPrado");
        Marcador mcd3 = new Marcador("diseño", "www.diseñoMuebles.pinterest.com", "Peter");
        Marcador mcd4 = new Marcador("patrones", "www.patronesDeDisenioJava.pinterest.com", "Daira");
        Marcador mcd5 = new Marcador("apirest", "www.weatherApi.google.com", "samual");

        Categoria disenio = new Categoria("Diseño");
        Categoria informatica = new Categoria("Informática");
        Categoria principal = new Categoria("principal");

        mcd1.addPalabrasClaves("ropa");
        mcd1.addPalabrasClaves("venta");
       
        mcd2.addPalabrasClaves("romeo");
        mcd2.addPalabrasClaves("museo");
        mcd2.addPalabrasClaves("Arte");
        
        mcd3.addPalabrasClaves("util");
        mcd3.addPalabrasClaves("strategy");
        mcd3.addPalabrasClaves("composite");
        mcd3.addPalabrasClaves("venta");

        mcd4.addPalabrasClaves("php");
        mcd4.addPalabrasClaves("javascript");
        mcd5.addPalabrasClaves("javascript");
        mcd5.addPalabrasClaves("venta");



        disenio.addElementos(mcd2);
        disenio.addElementos(mcd3);
        disenio.addElementos(mcd1);
       
        informatica.addElementos(mcd4);
        informatica.addElementos(mcd5);

        principal.addElementos(disenio);
        principal.addElementos(informatica);
        principal.addElementos(mcd3);

        System.out.println(disenio);
        System.out.println(disenio.getElementos());
        System.out.println(" contar marcadores");
        System.out.println(disenio.contarCantidadMarcadores());
        System.out.println("cant pal claves");
        System.out.println( informatica.cantidadPalabrasClaves());
        System.out.println("listado palabras claves");
        System.out.println(informatica.getPalabrasClaves());
        System.out.println( );

      
        System.out.println( );
        CondicionBusqueda buscarUrl = new BusquedaPorURL("google");
        CondicionBusqueda buscarNombreUsuario = new BusquedaPorNombreUsuario("peter");
        CondicionBusqueda buscarPalabraClave = new BusquedaPalabraClave("venta");
        CondicionBusqueda not = new BusquedaNOT(buscarUrl);
        CondicionBusqueda and = new BusquedaAND(buscarPalabraClave, not);

        ComparadorUsuarioNombre ordenUsuario = new ComparadorUsuarioNombre();
        ComparadorUrl ordenUrl = new ComparadorUrl();
        System.out.println("---busqueda-----");
        System.out.println(principal.buscarPor(buscarPalabraClave, ordenUrl));
        System.out.println();

        System.out.println("COPIA:");
        ElementoAdministrador copia=  principal.getCopia();
        System.out.println(copia.imprimir("//  "));
        System.out.println();
        
        System.out.println("COPIA parcial:");
        ElementoAdministrador copiaParcial= informatica.getCopia();
        System.out.println(copiaParcial.imprimir(">"));
        System.out.println();

        System.out.println("COPIA Restringida:");
        ElementoAdministrador copiaRestr = principal.getCopiaRestringida(and);
        ElementoAdministrador copiaRestr2 = principal.getCopiaRestringida(buscarPalabraClave);

        System.out.println(copiaRestr.imprimir("*"));
        System.out.println("------copia restringida 2");
        System.out.println(copiaRestr2.imprimir("*"));
    }
}
