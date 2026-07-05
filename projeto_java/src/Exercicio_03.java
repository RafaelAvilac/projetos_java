//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.print("Digite o primeiro valor: ");
        a = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = input.nextInt();
        System.out.print("Digite o quarto valor: ");
        d = input.nextInt();

        diferenca = a * b - c * d;

        System.out.println("Diferença: " + diferenca);

        input.close();
    }
}
