/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1, n2, soma = 0;
        System.out.print("Digite um valor: ");
        n1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        n2 = sc.nextInt();
        soma = n1 + n2;
        System.out.printf("A soma entre %d e %d é igual a %d.\n", n1, n2, soma);

        sc.close();
    }
}
