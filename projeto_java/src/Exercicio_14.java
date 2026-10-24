import java.util.Scanner;
public class Exercicio_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int soma = 0;
        while(n != 0){
            soma += n;
            System.out.println("Digite um numero: ");
            n = sc.nextInt();
        }
        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
