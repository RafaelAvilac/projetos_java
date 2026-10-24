/*Escreva um método media que receba três notas (decimais) e devolva a média.
No main, leia as notas, chame o método e mostre a média com 2 casas decimais.
Uma coisa pra pensar enquanto escreve: nos dois exercícios anteriores seus métodos receberam um parâmetro.*/

import java.util.Scanner;
import java.util.Locale;
public class Ex17 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, media;

        System.out.print("Digite a primeira nota: ");
        a = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        b = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        c = sc.nextDouble();

        media = calcularMedia(a, b, c);

        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
    public static double calcularMedia(double a, double b, double c){
        return (a+b+c)/3.0;
    }
}
