
package program.controleestoque.services;

public class Produto {
    
    private final int codigo;
    private String nome;
    private int quantidade;

    
    public Produto(int codigo, String nome, int qtd) {
        this.codigo = codigo;
        this.nome = nome;
        registrarEntrada(qtd);
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
       public int getCodigo() {
        return codigo;
    }

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public int getQuantidade() {
        return quantidade;
    }
    
    public void registrarEntrada(int qtd){
         
        quantidade+= qtd;
    }
    public boolean registrarSaida(int qtd){
        
        if(qtd > 0 && qtd <= quantidade){
             quantidade -= qtd;
               return true;
        }
        return false;
    }
    
    public String statusProduto(){
    
        if(quantidade > 20){
            
            return "Normal";
        }else if(quantidade >= 1){
            return "Baixo";
        }else{
            return "Esgotado";
        }
    
    }

    @Override
    public String toString() {
        return "\nProduto." + 
               "\nCodigo: " + codigo + 
               "\nNome: " + nome +
               "\nQuantidade: " + quantidade +
               "\nStatus: " + statusProduto();
    }
    
    
    
}
