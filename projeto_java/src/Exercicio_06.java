import java.util.Scanner;
import java.util.Locale;
public class Exercicio_06 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        media = (nota1 + nota2) / 2.0;
        System.out.printf("Media: %.2f%n", media);


        input.close();
    }
}
