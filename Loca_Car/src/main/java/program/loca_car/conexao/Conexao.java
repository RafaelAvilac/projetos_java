
package program.loca_car.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // conf do banco de dados
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/loca_car";
    private final String USUARIO = "usuario";
    private final String SENHA = "user3233";
    
    public Connection conectar(){
        
        try{
            
            //carregar o driver do MySQL
            Class.forName(driver);
            
            //retorna a conexao
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        
        }catch(ClassNotFoundException e){
            
            throw new RuntimeException("Driver não encontrado: " + e.getMessage());
            
        }catch(SQLException e){
            
            throw new RuntimeException("Erro ao conectar ao banco: " + e.getMessage());
        
        }
    
    
    }
    
}
