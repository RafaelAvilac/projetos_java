
package program.loja.models;

public class Vestuario extends Produto {
    private String tamanho;

    public Vestuario( String nome, String codigo, double precoBase, String tamanho) {
        super(nome, codigo, precoBase);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String gerarLinhaArquivo(){
        
        return super.gerarLinhaArquivo() + tamanho ;
    
    }
}
