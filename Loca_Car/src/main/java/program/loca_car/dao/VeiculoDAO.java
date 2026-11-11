
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
    // Método responsável por buscar todos os veículos no banco de dados.
// Retorna uma lista de objetos Veiculo preenchidos.
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
    
}
