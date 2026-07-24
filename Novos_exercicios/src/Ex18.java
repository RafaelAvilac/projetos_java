
import java.util.Scanner;
import java.util.Locale;
public class Ex18 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        long resultado;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();
        resultado = calcularFatorial(n);

        System.out.printf("Fatorial de %d = %d%n", n, resultado);

        sc.close();
    }
    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
