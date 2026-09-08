package program.prog_cotacao;

import java.util.Locale;
import java.util.Scanner;
import util.Converte;

public class Prog_cotacao {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual valor do dolar: ");
        double dolls = sc.nextDouble();
        
        System.out.println("Quantos dolares quer compra: ");
        double qtd = sc.nextDouble();
       
        double dollar = Converte.valorDolar(dolls,qtd);
        
        System.out.printf("Pagara: %.2f%n", dollar);
           
        sc.close();
    }
}
