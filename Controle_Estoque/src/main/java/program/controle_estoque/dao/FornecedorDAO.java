
package program.controle_estoque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import program.controle_estoque.objetos.Fornecedor;
import program.controle_estoque.util.Conexao;

public class FornecedorDAO {
    
    
    
    public Fornecedor buscarPorId(int id) {
        Fornecedor f = null;
        String sql = "SELECT * FROM fornecedor WHERE id_fornecedor = ?";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                f = new Fornecedor();
                f.setIdFornecedor(rs.getInt("id_fornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCnpj(rs.getString("cnpj"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar fornecedor: " + e.getMessage());
        }
        return f;
    }
    
    //crate
    public int inserir(Fornecedor f){
        String sql = "insert into fornecedor (nome, cnpj) values (?, ?)";
        int idGerado = 0;
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS)){
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                idGerado = rs.getInt(1);
                f.setIdFornecedor(idGerado); // atualiza obj fornecedor
            }
            System.out.println("Fornecedor " + f.getNome() + " cadastrado com sucesso! ID:"  + idGerado);
        }catch(SQLException e){
            System.out.println("Erro ao cadatrar fornecedor: " + e.getMessage());;
        
        }
    
        return idGerado;
    }
    //read
    public List<Fornecedor> listar(){
        
        List<Fornecedor> lista = new ArrayList<>();
        
        String sql = "select * from fornecedor";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()){
            
            while(rs.next()){
                Fornecedor f = new Fornecedor();
                
                f.setIdFornecedor(rs.getInt("id_fornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCnpj(rs.getString("cnpj"));
                
                lista.add(f);
            }
        
        }catch(SQLException e){
            System.out.println("Erro ao listar fornecedores: " + e.getMessage());
        }
        return lista;
    }
    //update
    public void atualizar(Fornecedor f){
        String sql = "update fornecedor set nome = ?, cnpj = ? where id_fornecedor = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.setInt(3, f.getIdFornecedor());
            
            stmt.executeUpdate();
            System.out.println("✅ Fornecedor atualizado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar fornecedor: " + e.getMessage());
        }
    }

    // 5. DELETE (Excluir)
    public void excluir(int id) {
        String sql = "DELETE FROM fornecedor WHERE id_fornecedor = ?";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("✅ Fornecedor excluído com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao excluir fornecedor: " + e.getMessage());
        }
    }
    
}
    
    
    
    
    
    
    
    
 
    

