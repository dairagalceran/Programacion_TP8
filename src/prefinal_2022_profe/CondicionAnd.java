package prefinal_2022_profe;

public class CondicionAnd extends Condicion {
	
	private Condicion c1, c2;
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return c1.cumple(noticia) && c2.cumple(noticia);
	}

}
