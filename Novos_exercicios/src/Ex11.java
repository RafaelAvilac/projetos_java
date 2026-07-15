/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.*/

import java.util.Scanner;
import java.util.Locale;
public class Ex11 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;

        System.out.print("Digite valor para a: ");
        a = sc.nextDouble();
        System.out.print("Digite valor para b: ");
        b = sc.nextDouble();
        System.out.print("Digite valor para c: ");
        c = sc.nextDouble();

        delta = (b * b) - 4 * a * c;
        System.out.printf("Delta: %.2f%n", delta);

        sc.close();
    }
}
