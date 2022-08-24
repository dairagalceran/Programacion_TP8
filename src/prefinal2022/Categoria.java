package prefinal2022;

import java.util.ArrayList;

public class Categoria extends ElementoSitio {
    
    private int numeroElementoDeterminarTema;
    private ArrayList<ElementoSitio> elementos;

    public Categoria(int numeroElementoDeterminarTema){
        this.numeroElementoDeterminarTema = numeroElementoDeterminarTema;
        this.elementos = new ArrayList<>();
    }

    public int getNumeroElementoDeterminarTema() {
        return numeroElementoDeterminarTema;
    }

    public void setCategorias(ArrayList<ElementoSitio> elementos) {
        this.elementos = elementos;
    }

    public void addCategorias(ElementoSitio el){
        if(!elementos.contains(el)){
            this.elementos.add(el);
        }
    }

    public String getTema(){
        if(elementos.isEmpty()){
            return null;
        }
        else{
            if(numeroElementoDeterminarTema > 0 && elementos.size() >  numeroElementoDeterminarTema){
                int lugar = this.getNumeroElementoDeterminarTema();
                return this.elementos.get(lugar -1).getTema();
            }else {
                return this.elementos.get(0).getTema();
            }
        }
        
    }

    public Categoria instanciar(){
        return new Categoria(this.getNumeroElementoDeterminarTema());
    }

    /*public ElementoSitio getCopia(){
        Categoria copia = this.instanciar();
        for(int i = 0; elementos.size() < i; i++){
            copia.addCategorias(elementos.get(i).getCopia());
        }
        return copia;
    }*/

    public ElementoSitio getCopiaRestringida(CondicionBusqueda cond){
        ArrayList<ElementoSitio> elementosQueCumplen = new ArrayList<>();
        for(int i =0; elementos.size()< i; i++){
            ElementoSitio ei = elementos.get(i);
            ElementoSitio copia_ei = ei.getCopiaRestringida(cond);
            if(copia_ei != null){
                elementosQueCumplen.add(copia_ei);
            }
        }if(elementosQueCumplen.isEmpty()){ //Si no tiene hijos que cumplen NO se retorna copia
            return null;
        }
        else{
            Categoria copia = this.instanciar();
            for(int j =0; elementosQueCumplen.size() < j; j++){
                copia.addCategorias(elementosQueCumplen.get(j));
            }
            return copia;
        }
    }

    @Override
	public String imprimir(String pref) {
		String aux = pref + this.toString();
		for (int i = 0; i < this.elementos.size(); i++)
			aux = aux + "\n" + this.elementos.get(i).imprimir(pref + pref.charAt(0));
		return aux;
	}

    public String toString(){
        String retorno =" CAtegoria : "+this.getTema();
        int i = 0;
        while (i < elementos.size()) {
            retorno+=elementos.get(i).toString();
            if (i!=elementos.size())
            i++;
        }
        return retorno;
    }
}
