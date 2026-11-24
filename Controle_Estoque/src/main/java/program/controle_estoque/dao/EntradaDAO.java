package program.controle_estoque.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import program.controle_estoque.objetos.Entrada;
import program.controle_estoque.util.Conexao;

public class EntradaDAO {
    public int inserir(Entrada e) {
        String sql = "INSERT INTO entrada (data_entrada, total_entrada, id_fornecedor) VALUES (?, ?, ?)";
        int idGerado = 0;
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDate(1, e.getDataEntrada());
            stmt.setDouble(2, e.getTotalEntrada());
            stmt.setInt(3, e.getIdFornecedor());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) { idGerado = rs.getInt(1); e.setIdEntrada(idGerado); }
        } catch (SQLException ex) { System.out.println("Erro: " + ex.getMessage()); }
        return idGerado;
    }

    public List<Entrada> listar() {
        List<Entrada> lista = new ArrayList<>();
        String sql = "SELECT * FROM entrada";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Entrada e = new Entrada();
                e.setIdEntrada(rs.getInt("id_entrada"));
                e.setDataEntrada(rs.getDate("data_entrada"));
                e.setTotalEntrada(rs.getDouble("total_entrada"));
                e.setIdFornecedor(rs.getInt("id_fornecedor"));
                lista.add(e);
            }
        } catch (SQLException ex) { System.out.println("Erro: " + ex.getMessage()); }
        return lista;
    }

    public Entrada buscarPorId(int id) {
        Entrada e = null;
        String sql = "SELECT * FROM entrada WHERE id_entrada = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                e = new Entrada();
                e.setIdEntrada(rs.getInt("id_entrada"));
                e.setDataEntrada(rs.getDate("data_entrada"));
                e.setTotalEntrada(rs.getDouble("total_entrada"));
                e.setIdFornecedor(rs.getInt("id_fornecedor"));
            }
        } catch (SQLException ex) { System.out.println("Erro: " + ex.getMessage()); }
        return e;
    }

    public void atualizar(Entrada e) {
        String sql = "UPDATE entrada SET data_entrada = ?, total_entrada = ?, id_fornecedor = ? WHERE id_entrada = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, e.getDataEntrada());
            stmt.setDouble(2, e.getTotalEntrada());
            stmt.setInt(3, e.getIdFornecedor());
            stmt.setInt(4, e.getIdEntrada());
            stmt.executeUpdate();
        } catch (SQLException ex) { System.out.println("Erro: " + ex.getMessage()); }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM entrada WHERE id_entrada = ?";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) { System.out.println("Erro: " + ex.getMessage()); }
    }
}
