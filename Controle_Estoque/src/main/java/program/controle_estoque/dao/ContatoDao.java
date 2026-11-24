
package program.controle_estoque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import program.controle_estoque.objetos.Contato;
import program.controle_estoque.util.Conexao;

public class ContatoDao {
    //CREATE 
    public void inserir(Contato c) {
        String sql = "insert into contato (tipo_contato, contato, id_fornecedor) values (?, ?, ?)";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, c.getTipoContato());
            stmt.setString(2, c.getContato());
            stmt.setInt(3, c.getIdFornecedor());
            
            stmt.executeUpdate();
            System.out.println("Contato cadastrado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar contato: " + e.getMessage());
        }
    }

    // READ 
    public List<Contato> listar() {
        List<Contato> lista = new ArrayList<>();
        String sql = "select * from contato";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Contato c = new Contato();
                c.setIdContato(rs.getInt("id_contato"));
                c.setTipoContato(rs.getString("tipo_contato"));
                c.setContato(rs.getString("contato"));
                c.setIdFornecedor(rs.getInt("id_fornecedor"));
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar contatos: " + e.getMessage());
        }
        return lista;
    }
    // UPDATE
    public void atualizar(Contato c) {
        String sql = "UPDATE contato SET tipo_contato = ?, contato = ?, id_fornecedor = ? WHERE id_contato = ?";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, c.getTipoContato());
            stmt.setString(2, c.getContato());
            stmt.setInt(3, c.getIdFornecedor());
            stmt.setInt(4, c.getIdContato());
            
            stmt.executeUpdate();
            System.out.println("✅ Contato atualizado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar contato: " + e.getMessage());
        }
    }

    // DELETE
    public void excluir(int id) {
        String sql = "DELETE FROM contato WHERE id_contato = ?";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("✅ Contato excluído com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao excluir contato: " + e.getMessage());
        }
    }
    
}
