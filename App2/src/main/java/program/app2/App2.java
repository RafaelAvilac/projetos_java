package program.app2;

import static java.lang.System.out;
import java.util.Scanner;
import program.app2.modelos.Conta;
import program.app2.modelos.Pessoa;

public class App2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        Conta conta = new Conta();
        
        System.out.print("Informe o nome: ");
        pessoa.setNome(sc.nextLine());
        System.out.print("Informe altura: ");
        pessoa.setAltura(sc.nextDouble());
        System.out.print("Informe idade: ");
        pessoa.setIdade(sc.nextInt());
        System.out.print("Valor para deposito: ");
        conta.deposito(sc.nextDouble());
        
        
        System.out.println("\nNome: "   + pessoa.getNome()   +
                           "\nAltura: " + pessoa.getAltura() +
                           "\nIdade: "  + pessoa.getIdade()  +
                           "\nSaldo: "  + conta.getSaldo());
        
        
        sc.close();
    }
}
