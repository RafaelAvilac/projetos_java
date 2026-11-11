
package program.loca_car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import program.loca_car.conexao.Conexao;
import program.loca_car.modelos.Cliente;

public class ClienteDAO {
    
    public Cliente buscarPorId(int id) {
        Cliente cliente = null;
        
        String sql = "select * from clientes where id_cliente = ?";
        
        try(Connection conn = new Conexao().conectar();
           PreparedStatement stmt = conn.prepareStatement(sql)) {
        
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCnh(rs.getString("cnh"));
                cliente.setTipoCnh(rs.getString("tipo_cnh"));
            }
           
        }catch(SQLException e){
           
            System.out.println("Erro ao buscar cliente por ID: " + e.getMessage());
        }
    
    
    return cliente;
    }
    
    
    //inserir dados (create - C)
    public void inserir(Cliente c){
        
        String sql =  "insert into clientes (nome, cnh, tipo_cnh) values (?, ?, ?)";
        
        //abre a conexão e prepara a consulta garantindo o fechamento  ao final da execução
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
    
    // listar todos (read - R)
    public List<Cliente> listar(){
        
         //instanciar uma ArrayList<Cliente> para guardar os registros retornados.
         List<Cliente> lista = new ArrayList<>();
         
         //guarda a instrução SQL que solicita todas as colunas e registros da tabela clientes.
         String sql = "select * from clientes";
         
         try(Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){
             
             //Percorre linha por linha da tabela clientes
             while(rs.next()){
                 
                 //Cria um novo objeto Cliente para cada registro retornado e 
                 //preenche os atributos usando os métodos setter.
                 Cliente c = new Cliente();
                 
                 c.setIdCliente(rs.getInt("id_cliente"));
                 c.setNome(rs.getString("nome"));
                 c.setCnh(rs.getString("cnh"));
                 c.setTipoCnh(rs.getString("tipo_cnh"));
                 
                 lista.add(c);//guarda o objeto preenchido na lista.
                 
             }
         }catch(SQLException e){
             System.out.println("Erro ao listar clientes: " + e.getMessage());
         
         }
         return lista;
    }
    
    // atualizar (update - U)
    
    public void atualizar(Cliente c){
        
        String sql = "update clientes set nome = ?,cnh = ?, tipo_cnh = ? where id_cliente = ?";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCnh());
            stmt.setString(3, c.getTipoCnh());
            stmt.setInt(4, c.getIdCliente());
            
            stmt.executeUpdate();
            System.out.println("Dados atualizado com sucesso.");
        
        }catch(SQLException e){
        
             System.out.println("Erro ao atualizar: " + e.getMessage());
        
        }
      
    }
    
    // deletar (delete - D)
    public void excluir(int id){
        
        String sql = "delete from clientes where id_cliente = ?";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Cliente excluido com sucesso.");
        
        
        }catch(SQLException e){
            
             System.out.println("Erro ao deletar cliente: " + e.getMessage());
        }
    
    }
    
}
