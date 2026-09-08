
package program.pj_computador_fiap;

public class Fabricante {
    String nome;
    String endereco;

    public Fabricante(){
    }
    
    public Fabricante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Fabricante{" 
                + "nome=" 
                + nome 
                + ", endereco=" 
                + endereco + '}';
    }
    
}
