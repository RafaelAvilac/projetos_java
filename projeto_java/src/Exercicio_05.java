import java.util.Scanner;
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float horas;
        System.out.print("Digite a hora: ");
        horas = input.nextFloat();
        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else if (horas < 18  ) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }
        input.close();
    }
}
