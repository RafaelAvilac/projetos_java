
package program.prjexemplointerface;

import program.prjexemplointerface.models.Autenticavel;


public class Autenticar {
    
    public void login(Autenticavel obj, String senha){
        
        boolean conseguiuLogar = obj.autenticar(senha);
    
        if(conseguiuLogar){
        
            System.out.println("Login efetuado no sistema");
        
        }else{
        
            System.out.println("Acesso negado");
            
        }
        
        System.out.println("----------------------");
        
        
        
    }
    
    
    
    
}
