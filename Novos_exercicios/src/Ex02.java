//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
//Ex:
//Qual é o seu nome? João da Silva
//Olá João da Silva, é um prazer te conhecer!
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.printf("Olá %s, é um prazer te conhecer!", nome);
        sc.close();
    }
}
