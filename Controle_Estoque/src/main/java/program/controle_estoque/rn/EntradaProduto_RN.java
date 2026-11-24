
package program.controle_estoque.rn;




import program.controle_estoque.dao.EntradaProdutoDAO;
import program.controle_estoque.objetos.EntradaProduto;

public class EntradaProduto_RN {
    private EntradaProdutoDAO dao;

    public EntradaProduto_RN() {
        this.dao = new EntradaProdutoDAO();
    }

    public void cadastrar(EntradaProduto ep) {
        if (ep.getIdEntrada() == 0 || ep.getIdProduto() == 0) {
            System.out.println("ERRO: A entrada e o produto devem ser informados!");
            return;
        }
        if (ep.getQuantidade() <= 0) {
            System.out.println("ERRO: A quantidade de produtos deve ser maior que zero!");
            return;
        }
        
        dao.inserir(ep);
    }
    
    public void listar() {
        // Útil para mostrar os itens que compõem a nota fiscal
        if (dao.listar().isEmpty()) {
            System.out.println("Nenhum item de entrada registrado.");
            return;
        }
        for (EntradaProduto ep : dao.listar()) {
            System.out.println("ID Entrada: " + ep.getIdEntrada() + " | ID Produto: " + ep.getIdProduto() + " | Qtd: " + ep.getQuantidade());
        }
    }
}
