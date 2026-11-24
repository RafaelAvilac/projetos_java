
package program.loca_car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import program.loca_car.conexao.Conexao;
import program.loca_car.modelos.Veiculo;


public class VeiculoDAO {
    
    
    public Veiculo buscarPorPlaca(String placa){
        
        Veiculo veiculo = null;
        
        String sql = "Select * from veiculos where placa = ?";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, placa);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                
                veiculo = new Veiculo();
                
                veiculo.setIdVeiculo(rs.getInt("id_veiculo"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setSituacao(rs.getString("situacao"));
                
                veiculo.setIdCategoria(rs.getInt("id_categoria"));
                
            }
        }catch(SQLException e){
        
            System.out.println("Erro ao buscar veiculo pela placa: " + e.getMessage());
        
        }
        
        return veiculo;
    }
    
    
    // inserir dados (crate - C)
    public void inserir(Veiculo v){
        
        String sql = "insert into veiculos (placa, modelo, situacao, id_categoria) values (?, ?, ?, ?)";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, v.getPlaca());
            stmt.setString(2, v.getModelo());
            stmt.setString(3, v.getSituacao());
            
            stmt.setInt(4, v.getIdCategoria());
            
            stmt.executeUpdate();
            
            System.out.println("Veiculo " + v.getModelo() + " cadastrado com sucesso");
               
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar veiculo." + e.getMessage());
        }
    
    }
  
    // listar todos (read - R)
    public List<Veiculo> listar() {
         List<Veiculo> lista = new ArrayList<>();
    
         String sql = "select * from veiculos";
    
          try (Connection conn = new Conexao().conectar();
              PreparedStatement stmt = conn.prepareStatement(sql);
               ResultSet rs = stmt.executeQuery()) {
        
             // Percorre cada linha do resultado
             while (rs.next()) {
            // Cria um objeto e mapeia os dados da linha atual
                 Veiculo v = new Veiculo();
                 v.setIdVeiculo(rs.getInt("id_veiculo"));
                 v.setPlaca(rs.getString("placa"));
                 v.setModelo(rs.getString("modelo"));
                 v.setSituacao(rs.getString("situacao"));
                 v.setIdCategoria(rs.getInt("id_categoria"));
            
            // Adiciona o objeto à lista
                    lista.add(v);
                }
            } catch (SQLException e) {
        
                  System.out.println("Erro ao listar veículos: " + e.getMessage());
        }
    
             return lista;
    }
    
    public void atualizar(Veiculo v){
        
        String sql = "update veiculos set placa = ?, modelo = ?, situacao = ?, id_categoria = ? where id_veiculo = ?";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, v.getPlaca());
            stmt.setString(2, v.getModelo());
            stmt.setString(3,v.getSituacao());
            stmt.setInt(4, v.getIdCategoria());
            
            //ID que vai na cláusula WHERE
            stmt.setInt(5, v.getIdVeiculo());
            
            stmt.executeUpdate();
            
            System.out.println("Veiculo atualizado com sucesso.");
             
        }catch(SQLException e){
            
            System.out.println("Erro ao atualizar veiculo" + e.getMessage());
        }
    
    }
    
    // deletar (delete - D)
    public void excluir(int id){
        
        String sql = "delete from veiculos where id_veiculo = ?";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("veiculo excluido com sucesso.");
        
        
        }catch(SQLException e){
            
             System.out.println("Erro ao deletar veiculo: " + e.getMessage());
        }
    
    
    }
    
}
