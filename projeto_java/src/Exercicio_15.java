import java.util.Scanner;
public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qt, soma = 0, n;
        System.out.println("Digite a quantidade: ");
         qt = sc.nextInt();
        for (int i = 0; i < qt; i++) {
            System.out.println("Digite um numero: ");
            n = sc.nextInt();
            soma += n;
        }
        System.out.println("Soma: " + soma);
        sc.close();
    }
}
