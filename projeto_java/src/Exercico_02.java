//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

import java.util.Scanner;
import java.util.Locale;

public class Exercico_02 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159, area, raio;

        System.out.print("Informe o valor do raio: ");
        raio = input.nextDouble();
        area = PI * Math.pow(raio, 2);

        System.out.printf("Area: %.4f%n", area);


        input.close();
    }
}
