/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/

import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ant, suc, n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();
        ant = n - 1;
        suc = n + 1;

        System.out.printf("O antecessor de %d é %d\n", n, ant);
        System.out.printf("O sucessor de %d é %d\n", n, suc);

        sc.close();
    }
}
