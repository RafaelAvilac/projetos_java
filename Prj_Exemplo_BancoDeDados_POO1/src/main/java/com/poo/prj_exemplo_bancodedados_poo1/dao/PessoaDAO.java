/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_exemplo_bancodedados_poo1.dao;

import com.poo.prj_exemplo_bancodedados_poo1.models.Pessoa;
import com.poo.prj_exemplo_bancodedados_poo1.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */
public class PessoaDAO 
{
    Connection conn;    
    public PessoaDAO() {
        conn = new Conexao().conectar();
    }    
    public Pessoa salvar(Pessoa p)
    {
        try
        {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PESSOAS(nome, cpf, idade) VALUES(?,?,?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());            
            stmt.setString(2, p.getCpf());
            stmt.setInt(3, p.getIdade());
            stmt.execute();// Executa o SQL no banco
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setId_pessoa(rs.getInt(1));
            }
            else{
                p.setId_pessoa(-1);
            }
        }
        catch(SQLException ex){  
            ex.printStackTrace();
        }
        return p;
    }
    
    public List<Pessoa> getPessoas()
    {
        ResultSet rs;
        List<Pessoa> lstP = new ArrayList<>();
        try
        {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pessoas",Statement.RETURN_GENERATED_KEYS);
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstP.add(getPessoa(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstP;
    }    
    private Pessoa getPessoa(ResultSet rs) throws SQLException
    {
        Pessoa p = new Pessoa();
        p.setId_pessoa(rs.getInt("id_pessoa"));
        p.setNome(rs.getString("nome"));
        p.setCpf(rs.getString("cpf"));
        p.setIdade(rs.getInt("idade"));
        return p;
    }
    
    public void excluir(Pessoa p)
    {
        try
        {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM pessoas WHERE id_pessoa = ?");
            stmt.setInt(1, p.getId_pessoa());
            stmt.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
