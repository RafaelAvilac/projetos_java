/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/

import java.util.Locale;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double COTACAO_DOLAR = 3.45;
        double reais, dolares;

        System.out.print("Digite o valor que possui em R$: ");
        reais = sc.nextDouble();
        dolares = reais / COTACAO_DOLAR;

        System.out.printf("Saldo em dolares: $ %.2f%n", dolares);
        sc.close();
    }
}
