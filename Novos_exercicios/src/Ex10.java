/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

import java.util.Scanner;
import java.util.Locale;
public class Ex10 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, altura, area, qtdTinta;
        final double RENDIMENTO_POR_LITRO = 2.0;

        System.out.print("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        area = largura * altura;
        qtdTinta = area / RENDIMENTO_POR_LITRO;

        System.out.printf("Área a ser pintada: %.2f m².%n", area);
        System.out.printf("Quantidade de tinta: %.2f litros.%n", qtdTinta);

        sc.close();
    }
}
