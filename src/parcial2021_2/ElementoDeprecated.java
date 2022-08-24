package parcial2021_2;

public class ElementoDeprecated extends Articulo {

    private int mesesObsoleto;
    private int porcentajeDescuentoMensual;

    public ElementoDeprecated(int id,  double valor, String descripcion, int mesesObsoleto, int porcentajeDescuentoMensual){
        super(id, valor, descripcion);
        this.mesesObsoleto = mesesObsoleto;
        this.porcentajeDescuentoMensual = porcentajeDescuentoMensual;
    }
    
    public int getMesesObsoleto() {
        return mesesObsoleto;
    }
    public void setMesesObsoleto(int mesesObsoleto) {
        this.mesesObsoleto = mesesObsoleto;
    }

    public int getPorcentajeDescuentoMensual() {
        return porcentajeDescuentoMensual;
    }
    public void setPorcentajeDescuentoMensual(int porcentajeDescuentoMensual) {
        this.porcentajeDescuentoMensual = porcentajeDescuentoMensual;
    }

    public  double getValor(){
        if(super.getAntiguedad() < this.mesesObsoleto){
            return super.getValor();
        }else{
            int diferencia = super.getAntiguedad() - mesesObsoleto;
            return super.getValor() - super.getValor()*this.porcentajeDescuentoMensual*diferencia/100;
        }
    }

    public String toString(){
        return super.toString()+" Meses obsoleto: "+this.getMesesObsoleto()+", % desc mensual: "+this.getPorcentajeDescuentoMensual();
    }
}
