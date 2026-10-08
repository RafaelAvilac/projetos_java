
package program.loja.models;

public class Eletronico extends Produto {
    
    private int garantiaMeses;

    public Eletronico(String nome, String codigo, double precoBase, int garantiaMeses) {
        super(nome, codigo, precoBase);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    
    @Override
    public String gerarLinhaArquivo(){
        
        return super.gerarLinhaArquivo() + garantiaMeses;
    
    }
    
}
