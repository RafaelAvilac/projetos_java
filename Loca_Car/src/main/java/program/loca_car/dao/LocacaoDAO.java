
package program.loca_car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import program.loca_car.conexao.Conexao;
import program.loca_car.modelos.Locacao;
import program.loca_car.modelos.Veiculo;

public class LocacaoDAO {
    
    public Locacao buscarPorId(int id){
        
        Locacao locacao = null;
        
        String sql = "select * from locacoes where id_locacao = ?";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
            
             locacao = new Locacao();
             
             locacao.setIdLocacao(rs.getInt("id_locacao"));
             locacao.setDataRetirada(rs.getDate("data_retirada"));
             locacao.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
             locacao.setDataDevolucaoReal(rs.getDate("data_devolucao_real"));
             locacao.setValorDiariaAplicada(rs.getDouble("valor_diaria_aplicada"));
             locacao.setIdCliente(rs.getInt("id_cliente"));
             locacao.setIdVeiculo(rs.getInt("id_veiculo"));
            
            }
        }catch(SQLException e){
            System.out.println("Erro ao buscar locacao por id: " + e.getMessage());
        }
    return locacao;
    }
    
    // inserir dados (crate - C)
    public void inserir(Locacao l){
        String sql = "insert into locacoes "
                   + "(data_retirada, data_prevista_devolucao, valor_diaria_aplicada, "
                   + "id_cliente, id_veiculo)"
                   + "values (?,?,?,?,?)";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setDate(1, l.getDataRetirada());
            stmt.setDate(2, l.getDataPrevistaDevolucao());
            stmt.setDouble(3, l.getValorDiariaAplicada());
            stmt.setInt(4, l.getIdCliente());
            stmt.setInt(5, l.getIdVeiculo());
            
            stmt.executeUpdate();
            
            System.out.println("Locacao realizada com sucesso.");
        
        }catch(SQLException e){
            
            if (e.getErrorCode() == 1644) {
               // Se for o erro da trigger
               System.out.println("REGRA DE NEGOCIO: " + e.getMessage());
           
            } else {
                // Se for outro erro
                System.out.println("Erro ao cadastrar locação: " + e.getMessage());
             }
        
         }
    }
    
    public List<Locacao> listar(){
        
        List<Locacao> lista = new ArrayList<>();
        String sql = "select * from locacoes";
        
        try(Connection conn = new Conexao().conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()){
            
            while(rs.next()){
                
                Locacao l = new Locacao();
                
                l.setIdLocacao(rs.getInt("id_locacao"));
                l.setDataRetirada(rs.getDate("data_retirada"));
                l.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
                l.setDataDevolucaoReal(rs.getDate("data_devolucao_real"));
                l.setValorDiariaAplicada(rs.getDouble("valor_diaria_aplicada"));
                l.setIdCliente(rs.getInt("id_cliente"));
                l.setIdVeiculo(rs.getInt("id_veiculo"));
                
                lista.add(l);
            
            }
        }catch(SQLException e){
            System.out.println("Erro ao listar Locacoes" + e.getMessage());
        }
        return lista;
    }
}
