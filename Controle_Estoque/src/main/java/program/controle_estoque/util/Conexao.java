
package program.controle_estoque.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private final String URL = "jdbc:mysql://localhost:3306/controle_estoque";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String USUARIO = "root";
    private final String SENHA = "120366Re$";
    
    
    public Connection conectar(){
        try{
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(ClassNotFoundException e){
            throw new RuntimeException("Drive nao encontrado" + e.getMessage());
        }catch(SQLException e){
            throw new RuntimeException("Erro ao conectar ao banco: " + e.getMessage());
        }
    }
     
}
