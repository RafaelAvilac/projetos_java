/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5*/

import java.util.Scanner;
import java.util.Locale;
public class Ex05 {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2.0;

        System.out.printf("A média entre %.1f e %.1f é igual a %.1f\n", nota1, nota2, media);

        sc.close();
    }
}
