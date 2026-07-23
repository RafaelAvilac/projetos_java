/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/

import java.util.Scanner;
import java.util.Locale;
public class Ex13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double AUMENTO = 0.15;
        double salario, novoSalario;

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();

        novoSalario = salario + (salario * AUMENTO);

        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
        sc.close();
    }
}
