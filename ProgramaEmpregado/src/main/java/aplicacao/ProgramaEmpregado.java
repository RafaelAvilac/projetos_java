package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitario.Empregado;

public class ProgramaEmpregado {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       Empregado emp = new Empregado();
       
        System.out.print("Nome: ");
        emp.nome = sc.nextLine();
        
        System.out.print("Salario atual: ");
        emp.salario = sc.nextDouble();
        
        System.out.print("Imposto: ");
        emp.imposto = sc.nextDouble();
       
        System.out.println("Empregado: " + emp);
        
        System.out.println("Qual é o percentual de aumento: ");
        double percentual = sc.nextDouble();
        emp.Aumento(percentual);
        
        
        System.out.println("Salario atualizado: " + emp);
        
        sc.close();
    }
}
