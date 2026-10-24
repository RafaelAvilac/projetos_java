//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codigo;
        double horas;
        double valor_horas;
        double salario;

        System.out.print("Digite o codigo do Funcionário: ");
        codigo = input.nextInt();
        System.out.print("Digite o numero de horas trabalhadas: ");
        horas = input.nextDouble();
        System.out.print("Digite o valor pago por hora: ");
        valor_horas = input.nextDouble();

        salario = valor_horas * horas;

        System.out.println("Funcionário: " + codigo);
        System.out.printf("Salário: R$%.2f%n", salario);

        input.close();
    }
}
