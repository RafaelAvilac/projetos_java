
package program.bank;

import program.bank.models.ContaBancaria;

public class Bank {

    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria("Ana Silva", 1001);
        ContaBancaria conta2 = new ContaBancaria("Bruno Costa", 1002);
       
        System.out.println("=== DADOS INICIAIS ===\n");
        conta1.exibirDados();
        conta2.exibirDados();
       
        System.out.println("=== OPERACOES ===\n");
        conta1.depositar(500.00);
        conta2.depositar(250.00);
        
        conta1.sacar(200);
        conta2.sacar(1000);
        
        conta1.depositar(-50);
        
        System.out.println("=== SALDOS ATUAIS ===\n");
        conta1.consultarSaldo();
        conta2.consultarSaldo();
        
        System.out.println("=== DADOS FINAIS ===\n");
        conta1.exibirDados();
        conta2.exibirDados();
       
       
       
    }
}
