

package program.corrretora;

import program.corrretora.entidades.Conta;
import program.corrretora.entidades.ContaJuridica;
import program.corrretora.entidades.ContaPoupanca;

public class Corrretora {

    public static void main(String[] args) {
       
        Conta cont = new Conta(1001, "Rafael", 0.00);
        ContaJuridica contJ = new ContaJuridica(500.00, 1002, "LS_locacao", 0.00);
    
        //UPCASTING
        
        Conta cont1 = contJ;
        Conta cont2 = new ContaJuridica(200.00, 1003, "DS_CONECT", 0.0);
        Conta cont3 = new ContaPoupanca(0.01, 1004, "Anderson", 0.0);
        
        //DOWNCASTING
        
        ContaJuridica cont4 = (ContaJuridica) cont2;
        cont4.limite(100.00);
        
        
        if(cont3 instanceof ContaJuridica){
        
            ContaJuridica cont5 = (ContaJuridica) cont3;
            cont5.limite(200.00);
            System.out.println("Emprestimo");
            
        }
        
        if(cont3 instanceof ContaPoupanca){
        
            ContaPoupanca cont5 = (ContaPoupanca) cont3;
            cont5.autalizarSaldo();
            System.out.println("Atualizado");
        
        }
        
    }
}
