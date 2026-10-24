package program.prjexemplointerface;

import program.prjexemplointerface.models.Cliente;
import program.prjexemplointerface.models.Gerente;


public class PrjExemploInterface {

    public static void main(String[] args) {
        Autenticar aut = new Autenticar();
        
        
        Gerente gerente = new Gerente("gerente", "senhaForte123");
        Cliente cliente = new Cliente("cliente", "cli@123");
        
        
        aut.login(gerente, "senhaForte123");
        aut.login(cliente, "senhaErrada");
        aut.login(cliente, "cli@123");
        
    }
}
