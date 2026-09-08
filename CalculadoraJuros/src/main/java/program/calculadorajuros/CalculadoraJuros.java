package program.calculadorajuros;

import java.util.Locale;
import java.util.Scanner;
import program.calculadorajuros.models.DadosEntradaConta;
import program.calculadorajuros.models.DadosSaidaConta;
import program.calculadorajuros.services.CalculadoraConta;

public class CalculadoraJuros {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       DadosEntradaConta de = new DadosEntradaConta();
       DadosSaidaConta ds = new DadosSaidaConta();
       
        System.out.print("Informe saldo inicial: ");
        de.setSaldoInicial(sc.nextDouble());
        
        System.out.print("Informe taxa de juros: ");
        de.setTaxaJurosMensal(sc.nextDouble());
        
        System.out.print("Informe quantos meses: ");
        de.setMeses(sc.nextInt());
        
        CalculadoraConta calculadora = new CalculadoraConta();
       
        calculadora.calcular(de, ds);
        
        System.out.printf("Saldo Final: %.2f%n", ds.getSaldoFinal());
        System.out.printf("Total Juros: %.2f%n", ds.getTotalJuros());
        
        sc.close();
    }
}
