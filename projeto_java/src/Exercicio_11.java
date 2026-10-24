import java.util.Scanner;

public class Exercicio_11 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Digite um numero: ");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.out.printf("%d é par%n", n);
        }
        else {
            System.out.printf("%d é impar%n", n);
        }
    sc.close();
    }
}
