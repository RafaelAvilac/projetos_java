
package program.prjexemplointerface.models;


public class Gerente implements Autenticavel {
    
    private String login;
    private String senhaSalva;

    public Gerente(String login, String senha) {
        this.login = login;
        this.senhaSalva = senha;
    }
    
    public boolean autenticar(String senha){
    
        
        if(this.senhaSalva.equals(senha)){
            System.out.println("Gerente " +  this.login + "autenticado com sucesso!");
            return true;
           
        }
        System.out.println("Falha na autenticacao do gerente" + this.login + ".");
        
        return false;
    
    
    }
    
    
}
