/*Escreva um método dobro que receba um número decimal e devolva o dobro dele.
O main lê o número, chama o método e mostra o resultado.*/
import java.util.Scanner;
import java.util.Locale;
public class Ex15 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, resultado;
        System.out.print("Digite um número para saber o seu dobro: ");
        a = sc.nextDouble();
        resultado = calcularDobro(a);

        System.out.printf("O dobro é: %.2f%n", resultado);

        sc.close();
    }
    public static double calcularDobro(double x){
        return x * 2.0;
    }
}
