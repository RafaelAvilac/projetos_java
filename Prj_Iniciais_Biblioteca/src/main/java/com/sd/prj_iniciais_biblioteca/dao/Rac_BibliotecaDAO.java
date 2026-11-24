/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sd.prj_iniciais_biblioteca.dao;
import java.sql.*;
import com.sd.prj_iniciais_biblioteca.modelo.Rac_Emprestimo;




public class Rac_BibliotecaDAO {
    
   public void salvarEmprestimo(Rac_Emprestimo emp){
       String sql = "INSERT INTO emprestimo (id_livro, nome_leitor, status) VALUES (?, ?, ?)";
      
       try(Connection conn = new Conexao().conectar();
           PreparedStatement stmt = conn.prepareStatement(sql)){
             stmt.setInt(1, emp.getId());
            stmt.setString(2, emp.getNome_leitor());
            stmt.setString(3, emp.getStatus());
        }catch(SQLException e){
           System.out.println("Erro " + e.getMessage());
    }                        
    
   
   }
}

    public void atualizarEstoqueLivro(int idLivro, int variacao){
        
        String sql = "UPDATE livro SET quantidade_disponivel = quantidade_disponivel + ? WHERE id = ?";
        
        try(Connection conn = new Conexao().conectar();
                
           PreparedStatement stmt = conn.prepareStatement(sql)){
             stmt.setInt(1, variacao);
             stmt.setInt(2, idLivro);
             stmt.executeUpdate();
        
        
             }catch(SQLException e){
                 System.out.println("Erro " + e.getMessage());
        
             }
    
    }
