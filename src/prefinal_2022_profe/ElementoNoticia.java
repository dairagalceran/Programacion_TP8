package prefinal_2022_profe;

public abstract class ElementoNoticia {
	
	public abstract int contar(Condicion c);
	public abstract String getTema();
	public abstract ElementoNoticia getCopiaRestringida(Condicion c);

}
