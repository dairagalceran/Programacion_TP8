package fileSystem7;

import fileSystem7.Archivo;
import fileSystem7.condiciones.*;
import java.util.ArrayList;


public class SistemaOperativo {
    public static void main(String[] args) {
        Carpeta raiz = new Carpeta("/");

        Carpeta sistemas = new Carpeta("Sistemas");

        Carpeta anio1 = new Carpeta("1er anio");
        Carpeta anio2 = new Carpeta("2do anio");
        Carpeta anio3 = new Carpeta("3er anio");
        Carpeta poo = new Carpeta("POO");

        Carpeta fotos = new Carpeta("Fotos");
        Carpeta mascotas = new Carpeta("Mascotas");
        Comprimido paisajes = new Comprimido("Paisajes", 0.5);

        raiz.agregarElemento(sistemas);
        raiz.agregarElemento(fotos);

        sistemas.agregarElemento(anio1);
        sistemas.agregarElemento(anio2);
        sistemas.agregarElemento(anio3);
        anio3.agregarElemento(poo);

        fotos.agregarElemento(mascotas);
        fotos.agregarElemento(paisajes);

        Archivo parcialPOO = new Archivo("parcial", "doc", 50.5);
        Archivo recuPOO = new Archivo("recuperatorio", "pdf", 150.5);
        Archivo prefiPOO = new Archivo("prefinal", "doc", 20.0);

        poo.agregarElemento(parcialPOO);
        poo.agregarElemento(recuPOO);
        poo.agregarElemento(prefiPOO);

        Archivo correlativas = new Archivo("correlativas", "xls", 120.0);
        sistemas.agregarElemento(correlativas);

        Archivo gatito =  new Archivo("gatito", "jpg", 2000.0);
        Archivo perrito =  new Archivo("perrito", "jpg", 1000.0);
        Archivo caballito =  new Archivo("caballito", "jpg", 3000.0);
        mascotas.agregarElemento(gatito);
        mascotas.agregarElemento(perrito);
        mascotas.agregarElemento(caballito);

        Archivo montanias =  new Archivo("montanias", "png", 2000.0);
        Archivo lago =  new Archivo("lago", "png", 2200.0);
        Archivo rio =  new Archivo("rio", "png", 2400.0);
        Archivo bosque =  new Archivo("bosque", "png", 2500.0);
        paisajes.agregarElemento(montanias);
        paisajes.agregarElemento(lago);
        paisajes.agregarElemento(rio);
        paisajes.agregarElemento(bosque);

        Link linkAPrefiPoo = new Link(prefiPOO);
        raiz.agregarElemento(linkAPrefiPoo);

        System.out.println(raiz);

        System.out.println("El tamanio de POO es "+poo.getTamanio());
        System.out.println("El tamanio de paisajes es "+paisajes.getTamanio());
        System.out.println("El tamanio del prefinal de POO es  "+prefiPOO.getTamanio());
        System.out.println("El tamanio del acceso directo al prefinal de POO es  "+linkAPrefiPoo.getTamanio());

        System.out.println("La cantidad total de archivos es "+raiz.cantidadArchivos());

        /*ArrayList<Archivo> archivosDoc = raiz.buscarPorExtension("doc");
        System.out.println(archivosDoc);

        ArrayList<Archivo> archivosMayoresA50 = raiz.buscarTamanioMayor(100.0);
        System.out.println(archivosMayoresA50);*/

        ArrayList<Archivo> resultado = raiz.buscar(new CondicionTamanioMayor(100.0));
        System.out.println(resultado);

        resultado = raiz.buscar(new CondicionNombreContiene("ito"));
        System.out.println(resultado);

        CondicionNot extensionDistintaDeJpg = new CondicionNot(new CondicionExtension("jpg"));
        resultado = raiz.buscar(extensionDistintaDeJpg);
        System.out.println(resultado);

        CondicionExtension condExtJpg = new CondicionExtension("jpg");
        CondicionExtension condExtPng = new CondicionExtension("png");
        CondicionAnd nojpgYnopng = new CondicionAnd(new CondicionNot(condExtJpg),
                                                new CondicionNot(condExtPng));
        resultado = raiz.buscar(nojpgYnopng);
        System.out.println(resultado);

    }
}
