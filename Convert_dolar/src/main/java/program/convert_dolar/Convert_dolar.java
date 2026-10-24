

package program.convert_dolar;

import java.util.Locale;
import java.util.Scanner;

public class Convert_dolar {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Qual o preco do dollar: ");
        double valor = sc.nextDouble();
        
        System.out.print("Quantidade de compra: ");
        double qtd = sc.nextDouble();
        
        double valorFinal = ConvertMoeda.converter(valor, qtd);
       
       
        System.out.printf("Valor a pagar: %,.2f%n", valorFinal);
        
        
        sc.close();
       
    }
}
