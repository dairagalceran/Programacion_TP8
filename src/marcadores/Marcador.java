package src-2.marcadores;

    p
  public class Marcador extends ElAdmin {
    ArrayList<String> pks;
 
 
  public void addPk(String s) {
	  if (!pks.contains(s)) {
		  pks.add(s);
	  }
  }
  
  @Override
  public ArrayList<String> getPks(){
	  return new ArrayList<String>(pks);
  }
}
