package program.controle_estoque.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import program.controle_estoque.objetos.EntradaProduto;
import program.controle_estoque.util.Conexao;

public class EntradaProdutoDAO {
    public void inserir(EntradaProduto ep) {
        String sql = "INSERT INTO entrada_produto (id_entrada, id_produto, quantidade) VALUES (?, ?, ?)";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ep.getIdEntrada());
            stmt.setInt(2, ep.getIdProduto());
            stmt.setInt(3, ep.getQuantidade());
            stmt.executeUpdate();
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
    }

    public List<EntradaProduto> listar() {
        List<EntradaProduto> lista = new ArrayList<>();
        String sql = "SELECT * FROM entrada_produto";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                EntradaProduto ep = new EntradaProduto();
                ep.setIdEntrada(rs.getInt("id_entrada"));
                ep.setIdProduto(rs.getInt("id_produto"));
                ep.setQuantidade(rs.getInt("quantidade"));
                lista.add(ep);
            }
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
        return lista;
    }

    // Como a chave é composta, precisamos de dois IDs para buscar
    public EntradaProduto buscarPorIds(int idEntrada, int idProduto) {
        EntradaProduto ep = null;
        String sql = "SELECT * FROM entrada_produto WHERE id_entrada = ? AND id_produto = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idEntrada);
            stmt.setInt(2, idProduto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                ep = new EntradaProduto();
                ep.setIdEntrada(rs.getInt("id_entrada"));
                ep.setIdProduto(rs.getInt("id_produto"));
                ep.setQuantidade(rs.getInt("quantidade"));
            }
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
        return ep;
    }

    public void atualizar(EntradaProduto ep) {
        String sql = "UPDATE entrada_produto SET quantidade = ? WHERE id_entrada = ? AND id_produto = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ep.getQuantidade());
            stmt.setInt(2, ep.getIdEntrada());
            stmt.setInt(3, ep.getIdProduto());
            stmt.executeUpdate();
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
    }

    public void excluir(int idEntrada, int idProduto) {
        String sql = "DELETE FROM entrada_produto WHERE id_entrada = ? AND id_produto = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idEntrada);
            stmt.setInt(2, idProduto);
            stmt.executeUpdate();
        } catch (SQLException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}
