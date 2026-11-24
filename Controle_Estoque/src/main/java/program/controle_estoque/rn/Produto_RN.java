
package program.controle_estoque.rn;

import program.controle_estoque.dao.ProdutoDAO;
import program.controle_estoque.objetos.Produto;


public class Produto_RN {
     private ProdutoDAO dao;

    public Produto_RN() {
        this.dao = new ProdutoDAO();
    }

    public void cadastrar(Produto p) {
        if (p.getNome() == null || p.getNome().trim().isEmpty()) {
            System.out.println("ERRO: O nome do produto e obrigatorio!");
            return;
        }
        if (p.getValor() <= 0) {
            System.out.println("ERRO: O valor do produto deve ser maior que zero!");
            return;
        }
        dao.inserir(p);
    }
    
    public void listar() {
        if (dao.listar().isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto p : dao.listar()) {
            System.out.println("ID: " + p.getIdProduto() + " | Nome: " + p.getNome() + " | Valor: R$ " + p.getValor());
        }
    }
}
