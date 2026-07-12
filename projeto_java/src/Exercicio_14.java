import java.util.Scanner;
public class Exercicio_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System .out.println("Digite um numero: ");
        n = sc.nextInt();

        int soma = n;

        while(n > 0){
            System.out.println("Digite um numero: ");
            n = sc.nextInt();
            soma += n;
        }
        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
