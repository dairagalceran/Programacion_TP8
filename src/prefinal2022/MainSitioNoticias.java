package prefinal2022;
import java.time.LocalDate;

public class MainSitioNoticias {
    
    public static void main(String[] args) {

        Noticia n1 = new Noticia("Asteroide", "Halk Jhonson", "el universo tiene fin");
        Comentario c1 = new Comentario("daira", "bueno");
        Comentario c2 = new Comentario("sara", "regular");

        Noticia n2 = new Noticia("Moda informe", "Amanda Fuentes", "tendencias europeas");
        Noticia n3 = new Noticia("DEsmienten aumento", "Carol Json", "Se viene el  fin");
        Noticia n4 = new Noticia("Vacaciones", "Paul Martin", "salidas gratuitas");

        n4.addComentario(c1);
        n1.addComentario(c2);
        n1.addComentario(c1);
        
        Categoria cat1= new Categoria(2);
        cat1.addCategorias(n1);
        cat1.addCategorias(n3);
        cat1.addCategorias(n2);

        System.out.println("---cat1--");
        System.out.println(cat1);
        System.out.println();

        System.out.println("--- cat2 ------------------");
        Categoria cat2= new Categoria(3);
        cat2.addCategorias(n4);
        
        System.out.println(cat2);
        System.out.println();

        System.out.println("--------------cat3-------");
        Categoria cat3= new Categoria(8);
        cat3.addCategorias(cat1);
        cat3.addCategorias(cat2);
    
        System.out.println(cat3);
        System.out.println();

       

        System.out.println("-----------------copi retringida ------------");
        CondicionBusqueda buscarAutor = new BusquedaPorAutor("Amanda");
        System.out.println(cat3.getCopiaRestringida(buscarAutor));

        
/* 

        System.out.println("-----------------copia noticia------------");
        System.out.println(n1.getCopia());
        System.out.println();

        System.out.println("-----------------copia categoria------------");
        ElementoSitio copia = cat3.getCopia();
        System.out.println(copia.imprimir(" * "));
        */
        System.out.println();
 
            NoticiaVentana nv = new NoticiaVentana("Con Ventana", "Juan", "Ventana", LocalDate.of(2022,8,15));
            Comentario coment1 = new Comentario("Pepe", "Hola");
            nv.addComentario(coment1);
            System.out.println(" comentarios not¡cia ventana");
            System.out.println(nv.getComentarios());
            System.out.println();

            NoticiaParalela np = new NoticiaParalela("Paralela",  "Nahuel", "Musical", nv);
            Comentario coment2 = new Comentario("Cacho", "Temazo");
            np.addComentario(coment2);

            System.out.println(" NOTICIA PARALELA");
            System.out.println(np);
            System.out.println();
            System.out.println((" Comentarios  noticia paralela"));
            System.out.println(np.getComentarios());
            System.out.println();

            System.out.println(" NOTICIA VENTANA");
            System.out.println(nv);
            System.out.println();
            System.out.println(" comentarios notiv¡cia ventana");
            System.out.println(nv.getComentarios());
            System.out.println();

            System.out.println(" comentarios not¡cia paralela");
            System.out.println(np.getComentarios());
            System.out.println();

            Categoria catEspeciales = new Categoria(1);
            catEspeciales.addCategorias(nv);
            catEspeciales.addCategorias(np);
            System.out.println(catEspeciales.getTema());
            
            Categoria general = new Categoria(9);
            general.addCategorias(catEspeciales);
            
            Noticia n5= new Noticia("Noticia 1",  "Cata", "Novedades");
            Noticia n6 = new Noticia("Noticia 2",  "Caro", "News");
            
            general.addCategorias(n5);
            general.addCategorias(n6);

            /*
            System.out.println(general.getTema());
            
            Condicion cond1 = new CondicionPorAutorComentario("Cacho");
            System.out.println(general.contar(cond1));
            
            Condicion cond2 = new CondicionPorAutor("Caro");
            System.out.println(general.contar(cond2));
            
            Condicion cond3 = new CondicionPorTexto("noti");
            System.out.println(general.contar(cond3));
            
            Condicion cond4 = new CondicionPorTema("Musical");
            System.out.println(general.contar(cond4));
            
            Condicion cond5 = new CondicionAnd(cond2, cond4);
            System.out.println(general.contar(cond5));
            
            System.out.println(general);
            System.out.println(general.getCopiaRestringida(cond2));
        }
*/
    }
}
