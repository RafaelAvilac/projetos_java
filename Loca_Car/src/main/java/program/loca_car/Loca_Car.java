
package program.loca_car;

import program.loca_car.dao.ClienteDAO;
import program.loca_car.modelos.Cliente;

public class Loca_Car {

    public static void main(String[] args) {
        
            /*teste de concxao
            Conexao conexao = new Conexao();
            conexao.conectar();
            System.out.println("Conectado com sucesso ao banco loca_car!");*/
           
            Cliente cliente = new Cliente(0 , "Beatriz Dias", "236656325", "AB");
            ClienteDAO clienteDAO = new ClienteDAO();
            
            clienteDAO.inserir(cliente);
           
    }    
}
