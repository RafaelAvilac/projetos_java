
package program.controle_estoque.rn;



import program.controle_estoque.dao.FornecedorDAO;
import program.controle_estoque.objetos.Fornecedor;

public class Fornecedor_RN {
    private FornecedorDAO dao;

    public Fornecedor_RN() {
        this.dao = new FornecedorDAO();
    }

    public void cadastrar(Fornecedor f) {
        if (f.getNome() == null || f.getNome().trim().isEmpty()) {
            System.out.println("ERRO: O nome do fornecedor é obrigatório!");
            return;
        }
        // Validação básica de tamanho do CNPJ
        if (f.getCnpj() == null || f.getCnpj().trim().length() != 14) {
            System.out.println("ERRO: O CNPJ deve conter exatamente 14 dígitos numéricos!");
            return;
        }
        
        // Se passar na validação, insere no banco
        dao.inserir(f);
    }
    
    public void listar() {
        if (dao.listar().isEmpty()) {
            System.out.println("Nenhum fornecedor cadastrado.");
            return;
        }
        for (Fornecedor f : dao.listar()) {
            System.out.println("ID: " + f.getIdFornecedor() + " | Nome: " + f.getNome() + " | CNPJ: " + f.getCnpj());
        }
    }
}