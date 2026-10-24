package program.prj_bancodedados_poo1;

import program.prj_bancodedados_poo1.dao.PessoaDAO;
import program.prj_bancodedados_poo1.models.Pessoa;
import program.prj_bancodedados_poo1.util.Conexao;

public class Prj_BancoDeDados_POO1 {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        //c.conectar();
        PessoaDAO pDAO = new PessoaDAO();
        Pessoa p = new Pessoa();
        p.setNome("Teste 1");
        p.setCpf("12332112335");
        p.setIdade(20);
        
        pDAO.salvar(p);
        
        System.out.println(p.getId_pessoa());
    }
}
