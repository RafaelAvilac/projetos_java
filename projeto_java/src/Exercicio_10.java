import java.util.Scanner;
import java.util.Locale;
public class Exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, aumento, novoSalario;

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        aumento = salario * 15.0 / 100.0;
        novoSalario = salario + aumento;
        
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        sc.close();
    }
}


