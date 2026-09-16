package program.sistemaBancario;

import java.util.Locale;
import java.util.Scanner;
import program.sistemaBancario.services.ContaBancaria;

public class Banco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do titular: ");
        String titular = sc.nextLine();
        
        System.out.print("Numero da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Deseja relizar deposito (1 = sim /2 = não): ");
        int opcao = sc.nextInt();
        
        ContaBancaria conta;
        
        if (opcao == 1){
            System.out.println("Informe o valor: ");
            double quantia = sc.nextDouble();
            conta = new ContaBancaria(titular, numero, quantia);
        }else{
            conta = new ContaBancaria(titular, numero);
        }
        
        System.out.println(conta);
         
        System.out.print("Efetue um deposito: ");
        double quantia = sc.nextDouble();
        conta.depositar(quantia);
        
        System.out.println();
        System.out.println(conta);
         
        System.out.print("Efetue um saque: ");
        quantia = sc.nextDouble();
        conta.sacar(quantia);
        
        System.out.println();
        System.out.println(conta);
         
         
         sc.close();
    }
}
