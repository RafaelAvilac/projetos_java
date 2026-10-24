
package program.prj_bancodedados_poo1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import program.prj_bancodedados_poo1.models.Pessoa;
import program.prj_bancodedados_poo1.util.Conexao;


public class PessoaDAO {
    
    Connection conn;

    public PessoaDAO() {
        conn = new Conexao().conectar();
    }
    public Pessoa salvar(Pessoa p){
    
        try{
            PreparedStatement stmt = conn.prepareStatement("iNSERT INTO PESSOAS"
                    + "(nome, cpf, idade) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
        
                stmt.setString(1, p.getNome());
                stmt.setString(2, p.getCpf());
                stmt.setInt(3, p.getIdade());
                stmt.execute();
                ResultSet rs = stmt.getGeneratedKeys();
                
                    if(rs.next()){
                        p.setId_pessoa(rs.getInt(1));
                    }else{
                        p.setId_pessoa(-1);
                    
                    }
        
        }catch(SQLException ex){
            ex.printStackTrace();
        
        }
        
        return p;
  
    }
     
}
