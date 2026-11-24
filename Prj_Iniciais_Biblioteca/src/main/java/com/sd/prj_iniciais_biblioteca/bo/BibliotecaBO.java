/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sd.prj_iniciais_biblioteca.bo;

import com.sd.prj_iniciais_biblioteca.modelo.Rac_Emprestimo;
import java.sql.SQLException;

public class BibliotecaBO {
    
    private Rac_BibliotecaDAO dao;

    public BibliotecaBO() {
    }

    public String salvarEmprestimo(Rac_Emprestimo emp) {
        try {
            dao.salvarEmprestimo(emp);
            dao.atualizarEstoqueLivro(emp.getLivro().getId(), -1);
            return "Empréstimo registrado com sucesso!";
        } catch (SQLException e) {
            return "Erro ao salvar empréstimo: " + e.getMessage();
        }
    }

    public String excluirEmprestimo(int idEmprestimo) {
        
    
       if(idEmprestimo == 0){
           System.out.println("Erro ao excluir: ");
           return;
       }
    }   
        
        
        
        
        
       