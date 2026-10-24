/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/

import java.util.Scanner;
import java.util.Locale;
public class Ex12 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double DESCONTO = 0.05;
        double preco, precoPromocao;

        System.out.print("Digite o valor do produto: ");
        preco = sc.nextDouble();
        precoPromocao = preco - (preco * DESCONTO);
        System.out.printf("PREÇO PROMOCIONAL: R$ %.2f%n", precoPromocao);

        sc.close();
    }
}
