package prefinal_2022_profe;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		NoticiaConVentana nv = new NoticiaConVentana("Con Ventana", "Habia una vez una noticia..", "Juan", "Ventana", LocalDate.of(2022,8,15));
		Comentario coment1 = new Comentario("Pepe", "Hola");
		nv.addComentario(coment1);
		System.out.println(nv.getComentarios());
		
		NoticiaParalela np = new NoticiaParalela("Paralela", "Mi universo paralelo", "Nahuel", "Musical", nv);
		Comentario coment2 = new Comentario("Cacho", "Temazo");
		np.addComentario(coment2);
		System.out.println(nv.getComentarios());
		System.out.println(np.getComentarios());
		
		Categoria catEspeciales = new Categoria(1);
		catEspeciales.addElemento(nv);
		catEspeciales.addElemento(np);
		System.out.println("tema cat especial");
		System.out.println(catEspeciales.getTema());
		
		Categoria general = new Categoria(5);
		general.addElemento(catEspeciales);
		
		Noticia n1 = new Noticia("Noticia 1", "Esto es una noticia", "Cata", "Novedades");
		Noticia n2 = new Noticia("Noticia 2", "Que notici�n!", "Caro", "News");
		
		general.addElemento(n1);
		general.addElemento(n2);
		System.out.println(" general tema ");
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

}
