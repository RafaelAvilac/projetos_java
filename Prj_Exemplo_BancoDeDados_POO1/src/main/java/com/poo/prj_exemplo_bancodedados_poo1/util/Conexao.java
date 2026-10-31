/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.prj_exemplo_bancodedados_poo1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author IFTM
 */
public class Conexao 
{
    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/bd_pessoas";
    final private String usuario = "root";
    final private String senha = "120366Re$";
    
    public Connection conectar()
    {
        Connection conn = null;        
        try
        {            
            Class.forName(driver);
            conn = DriverManager.getConnection(url,usuario,senha);
        }
        catch(ClassNotFoundException ex)
        {  
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return conn;
    }
}
