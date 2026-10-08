
package program.loja.models;

public class Produto implements Exportavel {
    private String nome;
    private String codigo;
    private double precoBase;

    public Produto(String nome, String codigo, double precoBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
  

    @Override
    public String gerarLinhaArquivo() {
        
         return  nome + ";" + codigo + ";" + precoBase + ";";
         
    }

}
