
package program.loca_car;

import java.util.List;
import program.loca_car.conexao.Conexao;
import program.loca_car.dao.VeiculoDAO;
import program.loca_car.modelos.Veiculo;

public class Loca_Car {

    public static void main(String[] args) {
        
            //teste de concxao
        
            Conexao conexao = new Conexao();
            conexao.conectar();
            System.out.println("Conectado com sucesso ao banco loca_car!");
           
            
            
           /* ClienteDAO clienteDAO = new ClienteDAO();
            Cliente c = clienteDAO.buscarPorId(3);
           // clienteDAO.inserir(cliente);
            
           /*List<Cliente> clientes = clienteDAO.listar();
           for (Cliente c : clientes) {
                 System.out.println("ID: " + c.getIdCliente() + 
                       " | Nome: " + c.getNome() + 
                       " | CNH: " + c.getCnh() + 
                       " | Tipo: " + c.getTipoCnh());
            }
            if (c != null) {
                System.out.println("Cliente encontrado: " + c.getNome());
            } else {
                System.out.println("Cliente não encontrado no banco de dados.");
            }*/
           
           /*Veiculo v = new Veiculo();
            v.setPlaca("XYZ-9876");
            v.setModelo("Fiat Uno");
            v.setSituacao("Disponivel");
            // Atenção: O idCategoria precisa ser de uma categoria que já exista na sua tabela 'categoria' no banco!
            v.setIdCategoria(1); 

            VeiculoDAO veiculoDAO = new VeiculoDAO();
            veiculoDAO.inserir(v);*/
           
            VeiculoDAO veiculoDAO = new VeiculoDAO();
            List<Veiculo> frota = veiculoDAO.listar();

            System.out.println("--- LISTA DE VEÍCULOS CADASTRADOS ---");

             // Usamos um laço 'for' para percorrer a lista e imprimir cada carro
             for (Veiculo v : frota) {
                 System.out.println("ID: " + v.getIdVeiculo() + 
                                    " | Modelo: " + v.getModelo() + 
                                    " | Placa: " + v.getPlaca() + 
                                    " | Situação: " + v.getSituacao());
}
    }    
}
