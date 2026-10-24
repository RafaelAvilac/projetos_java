/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no  final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850.45 em Junho.*/
import java.util.Locale;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    String nome;
    double salario;
    System.out.print("Digite seu nome: ");
    nome = sc.nextLine();
    System.out.print("Digite seu salario: ");
    salario = sc.nextDouble();
    sc.nextLine();
    System.out.printf("Nome do Funcionário: %s\n", nome);
    System.out.printf("Salário: R$ %.2f\n", salario);
    System.out.printf("O funcionário %s tem um salário de R$%.2f em Junho.\n", nome, salario);
    sc.close();
    }
}
