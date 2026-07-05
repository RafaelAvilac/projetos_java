import java.util.Scanner;
public class Exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = input.nextInt();
        if(numero < 0){
            System.out.println("NEGATIVO");
        }
        else if(numero > 0){
            System.out.println("NÃO NEGATIVO");
        }
        else{
            System.out.println("NAO NEGATIVO");
        }

        input.close();
    }
}
