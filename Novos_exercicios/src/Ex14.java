/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/
import java.util.Scanner;
import java.util.Locale;
public class Ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PRECO_KM_RODADO = 0.20, PRECO_DIA_ALUGADO = 90.0;
        double kmRodado, valorDevido;
        int diasLocado;
        System.out.print("Quantidade de km rodados: ");
        kmRodado = sc.nextDouble();
        System.out.print("Quantidade de dias locados: ");
        diasLocado = sc.nextInt();

        valorDevido = kmRodado * PRECO_KM_RODADO + diasLocado * PRECO_DIA_ALUGADO;

        System.out.printf("Valor devido: R$ %.2f%n", valorDevido);

        sc.close();
    }
}
