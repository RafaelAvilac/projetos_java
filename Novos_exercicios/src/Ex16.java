/*Escreva um método ehPar que receba um inteiro e devolva
 true se for par, false se for ímpar.
 O main usa esse retorno num if pra imprimir a mensagem.

Conceito novo: o tipo de retorno aqui é boolean. Você já usou o operador % pra isso — a novidade é devolver o resultado do teste em vez de imprimir direto.*/
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        boolean resultado;
        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();
        resultado = verificarParidade(n);
        if(resultado){
            System.out.printf("O número %d é par%n", n);
        }else {
            System.out.printf("O número %d é impar%n", n);
        }

        sc.close();
    }
    public static boolean verificarParidade(int x){
      return x % 2 == 0;
    }
}
