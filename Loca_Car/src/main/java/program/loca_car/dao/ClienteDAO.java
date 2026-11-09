
package program.loca_car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import program.loca_car.conexao.Conexao;
import program.loca_car.modelos.Cliente;

public class ClienteDAO {
    
    //inserir dados
    public void inserir(Cliente c){
        
        String sql =  "insert into clientes (nome, cnh, tipo_cnh) values (?, ?, ?)";
        
        //O try fecha a conexão automaticamente no final
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCnh());
            stmt.setString(3, c.getTipoCnh());
            
            stmt.executeUpdate();
            
            System.out.println("Cliente " + c.getNome() + " cadastrado com sucesso");
        
        }catch(SQLException e){
        
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    
    }
    
    
}
