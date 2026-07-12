/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/

import java.util.Locale;
import java.util.Scanner;
public class Ex07 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n, dobro, terco;

        System.out.print("Digite um número: ");
        n = sc.nextDouble();
        dobro = n + n; // n * 2
        terco = n / 3.0;

        System.out.printf("O dobro de %.1f é %.1f\n", n, dobro);
        System.out.printf("A terça parte de %.1f é %.5f\n", n, terco);

        sc.close();
    }
}
