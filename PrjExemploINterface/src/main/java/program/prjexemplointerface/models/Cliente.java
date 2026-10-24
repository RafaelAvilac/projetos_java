
package program.prjexemplointerface.models;

public class Cliente implements Autenticavel {
    
    private String email;
    private String senhaAcesso;
    
    public Cliente(String email, String senha){
        this.email = email;
        this.senhaAcesso = senha;
    
    }
    public  boolean autenticar(String senha){
        
        if(this.senhaAcesso.equals(senha)){
            System.out.println("Cliente "+ this.email + "autenticado com sucesso!");
            return true;
           
        }
        System.out.println("Falha na autenticacao do cliente" + this.email + ".");
        
        return false;
    }
      
}
