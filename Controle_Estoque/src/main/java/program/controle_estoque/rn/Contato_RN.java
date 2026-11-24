
package program.controle_estoque.rn;
import program.controle_estoque.dao.ContatoDao;
import program.controle_estoque.objetos.Contato;

public class Contato_RN {
    
    private ContatoDao dao;

    public Contato_RN() {
        
        this.dao = new ContatoDao();
    }

    public void cadastrar(Contato c) {
        if (c.getTipoContato() == null || c.getTipoContato().trim().isEmpty()) {
            System.out.println("ERRO: O tipo de contato (Ex: Comercial) e obrigatorio!");
            return;
        }
        if (c.getContato() == null || c.getContato().trim().isEmpty()) {
            System.out.println("ERRO: O telefone / e-mail do contato e obrigatorio!");
            return;
        }
        // Verifica se o contato está sendo vinculado a um fornecedor
        if (c.getIdFornecedor() == 0) {
            System.out.println("ERRO: O contato deve estar vinculado a um fornecedor valido!");
            return;
        }
        
        dao.inserir(c);
    }
    
    public void listarPorFornecedor(int idFornecedor) {
        // Método extra útil para buscar contatos de um fornecedor específico
        for (Contato c : dao.listar()) {
            if (c.getIdFornecedor() == idFornecedor) {
                System.out.println("ID: " + c.getIdContato() + " | Tipo: " + c.getTipoContato() + " | Contato: " + c.getContato());
            }
        }
    }
}
