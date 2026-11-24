
package program.loca_car.bo;

import program.loca_car.dao.ClienteDAO;
import program.loca_car.modelos.Cliente;

public class ClienteBO {
    
    private ClienteDAO dao;

    public ClienteBO(ClienteDAO dao) {
        
        this.dao = dao;
    }

   public void cadastrarCliente(Cliente c){
       
      
        if (c.getNome() == null || c.getNome().trim().isEmpty()) {
            System.out.println("ERRO: O nome do cliente é obrigatório!");
            return; // Aborta a operação
        }

       
        if (c.getCnh() == null || c.getCnh().trim().isEmpty()) {
            System.out.println("ERRO: A CNH do cliente é obrigatória!");
            return;
        }

       
        if (c.getCnh().length() != 11 ) {
            System.out.println("ERRO: A CNH informada é inválida!");
            return;
        }

       
        dao.inserir(c);
   
   }
   
  
    
    
}
