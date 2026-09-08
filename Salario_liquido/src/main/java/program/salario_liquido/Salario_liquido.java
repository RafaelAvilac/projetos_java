package program.salario_liquido;

import java.util.Scanner;
import program.salario_liquido.models.DadosEntradaSalario;
import program.salario_liquido.models.DadosSaidaSalario;
import program.salario_liquido.services.CalculadoraSalario;

public class Salario_liquido {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     DadosEntradaSalario entrada = new DadosEntradaSalario();
     DadosSaidaSalario saida = new DadosSaidaSalario();
     CalculadoraSalario calculadora = new  CalculadoraSalario();
     
     
        System.out.print("Informe salario bruto: ");
        entrada.setSalarioBruto(sc.nextDouble());
        
        System.out.print("Informe desconto inss: ");
        entrada.setDescontoINSS(sc.nextDouble());
        
        System.out.print("Informe desconto iR: ");
        entrada.setDescontoIR(sc.nextDouble());
        
        calculadora.calcular(entrada, saida);
        
        System.out.printf("Valor salário líquido: R$ %.2f%n", saida.getSalarioLiquido());
        System.out.printf("Total de desconto: R$ %.2f%n", saida.getTotalDesconto());
        
        sc.close();
     
    }
}
