import java.util.Scanner;
import java.util.Locale;

public class Ex004 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        nome = sc.next();
        System.out.println("Nome digitado: " + nome);

        int x;
        x = sc.nextInt();
        System.out.println("Numero digitado: " + x);

        double y;
        y = sc.nextDouble();
        System.out.println("Numero flutuante:" + y);

        char z;
        z = sc.next().charAt(0);
        System.out.println("Letra digitada: " + z);

        sc.close();
    }
}
