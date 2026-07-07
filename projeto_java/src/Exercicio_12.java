import java.util.Scanner;
import java.util.Locale;
public class Exercicio_12 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media = 0.0;
        System.out.print("Digite a média: ");
        media = sc.nextDouble();
        if(media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    sc.close();
    }

}
