import java.util.Scanner;
import java.util.Locale;
public class Exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro;
        System.out.print("Digite a base: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();
        area = base*altura;
        perimetro = 2.0 * (base+altura);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        sc.close();
    }
}
