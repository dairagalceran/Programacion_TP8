package fileSystemCopia;
import fileSystemCopia.condiciones.*;


public class SistemaOperativo {
    public static void main(String[] args) {
        Carpeta raiz = new Carpeta("/");

        Carpeta tudai = new Carpeta("TUDAI");

        Carpeta anio1 = new Carpeta("1er a�o");
        Carpeta anio2 = new Carpeta("2do a�o");
        Carpeta prog2 = new Carpeta("Programaci�n 2");

        Carpeta fotos = new Carpeta("Fotos");
        Carpeta mascotas = new Carpeta("Mascotas");
        Comprimido paisajes = new Comprimido("Paisajes", 0.5);

        raiz.agregarElemento(tudai);
        raiz.agregarElemento(fotos);

        tudai.agregarElemento(anio1);
        tudai.agregarElemento(anio2);
        anio1.agregarElemento(prog2);

        fotos.agregarElemento(mascotas);
        fotos.agregarElemento(paisajes);

        Archivo parcialProg2 = new Archivo("parcial", "doc", 50.5);
        Archivo recuProg2 = new Archivo("recuperatorio", "pdf", 150.5);
        Archivo prefiProg2 = new Archivo("prefinal", "doc", 20.0);

        prog2.agregarElemento(parcialProg2);
        prog2.agregarElemento(recuProg2);
        prog2.agregarElemento(prefiProg2);

        Archivo calendario = new Archivo("Calendario", "pdf", 120.0);
        tudai.agregarElemento(calendario);

        Archivo gatito =  new Archivo("gatito", "jpg", 2000.0);
        Archivo perrito =  new Archivo("perrito", "jpg", 1000.0);
        Archivo caballito =  new Archivo("caballito", "jpg", 3000.0);
        mascotas.agregarElemento(gatito);
        mascotas.agregarElemento(perrito);
        mascotas.agregarElemento(caballito);

        Archivo lago =  new Archivo("lago", "png", 2200.0);
        Archivo rio =  new Archivo("rio", "png", 2400.0);
        Archivo bosque =  new Archivo("bosque", "png", 2500.0);
        paisajes.agregarElemento(lago);
        paisajes.agregarElemento(rio);
        paisajes.agregarElemento(bosque);

        Link linkAPrefiProg2 = new Link(prefiProg2);
        raiz.agregarElemento(linkAPrefiProg2);
        
        Carpeta diario = new Carpeta("Diarios");
        Archivo ole = new Archivo("Ole", "pdf", 1500);
        diario.agregarElemento(ole);
        
        raiz.agregarElemento(diario);

        System.out.println("---raiz------");
        System.out.println(raiz);

        System.out.println("--------imprimir raiz ---------");
        System.out.println(raiz.imprimir("-"));
        
        System.out.println( );
        System.out.println("COPIA:");
        
        ElementoFS copia_raiz = raiz.getCopia();
        
        System.out.println(copia_raiz.imprimir("-"));
        
        System.out.println();
        System.out.println("-----COPIA PARCIAL carpeta TUDAI----");
        System.out.println(tudai.getCopia().imprimir("-"));
        
        System.out.println();
        System.out.println("----copia parcial carpeta mascotas");
        System.out.println(mascotas.getCopia().imprimir("-"));

        System.out.println();
        System.out.println("COPIA RESTRINGIDA:");
    
        CondicionNombreContiene letras = new CondicionNombreContiene("pre");
        ElementoFS copia_restringida_raiz = raiz.getCopiaRestringida(letras);
        System.out.println(copia_restringida_raiz.imprimir("-"));
    }
}
        /*
        System.out.println("El tamanio de TUDAI es "+tudai.getTamanio());
        System.out.println("El tamanio de paisajes es "+paisajes.getTamanio());
        System.out.println("El tamanio del prefinal de Prog2 es  "+prefiProg2.getTamanio());
        System.out.println("El tamanio del acceso directo al prefinal de Prog es  "+ linkAPrefiProg2.getTamanio());
        System.out.println("La cantidad total de archivos es "+raiz.cantidadArchivos());
        */