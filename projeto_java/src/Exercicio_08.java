import java.util.Scanner;
import java.util.Locale;
public class Exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double grausC, grausF;
        System.out.print("Digite a temperatura em Celsius: ");
        grausC = input.nextDouble();
        grausF = (grausC * 9.0 / 5.0) + 32.0;
        System.out.printf("Fahrenheit: %.1f%n", grausF);
        input.close();
    }
}
