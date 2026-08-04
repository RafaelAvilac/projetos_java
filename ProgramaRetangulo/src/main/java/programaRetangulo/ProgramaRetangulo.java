package programaRetangulo;

import java.util.Locale;
import java.util.Scanner;
import utilitario.Retangulo;


public class ProgramaRetangulo {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Retangulo x = new Retangulo();
        
        System.out.print("Digite a largura: ");
        x.altura = sc.nextDouble();
        
        System.out.println( );
        System.out.print("Digite a altura: ");
        x.largura = sc.nextDouble();
        
        System.out.printf("Area: %.2f%n", x.area());
        System.out.printf("Perimetro: %.2f%n", x.perimetro());
        System.out.printf("Diagonal: %.2f%n", x.diagonal());
        
        sc.close();
        
    }
}
