package program.controle_estoque.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import program.controle_estoque.objetos.Produto;
import program.controle_estoque.util.Conexao;

public class ProdutoDAO {
    public int inserir(Produto p) {
        String sql = "INSERT INTO produto (nome, valor) VALUES (?, ?)";
        int idGerado = 0;
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getValor());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) { idGerado = rs.getInt(1); p.setIdProduto(idGerado); }
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
        return idGerado;
    }

    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("id_produto"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getDouble("valor"));
                lista.add(p);
            }
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
        return lista;
    }

    public Produto buscarPorId(int id) {
        Produto p = null;
        String sql = "SELECT * FROM produto WHERE id_produto = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = new Produto();
                p.setIdProduto(rs.getInt("id_produto"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getDouble("valor"));
            }
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
        return p;
    }

    public void atualizar(Produto p) {
        String sql = "UPDATE produto SET nome = ?, valor = ? WHERE id_produto = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getValor());
            stmt.setInt(3, p.getIdProduto());
            stmt.executeUpdate();
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM produto WHERE id_produto = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}
