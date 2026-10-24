package program.geometriadocirculo;

import java.util.Scanner;
import program.geometriadocirculo.models.DadosEntradaCirculo;
import program.geometriadocirculo.models.DadosSaidaCirculo;
import program.geometriadocirculo.services.CalculadoraCirculo;

public class GeometriaDoCirculo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        DadosEntradaCirculo entrada = new DadosEntradaCirculo();
      
        CalculadoraCirculo calculadora = new CalculadoraCirculo();
        
        System.out.println("Informe o raio do circulo: ");
        entrada.setRaio(sc.nextDouble());
        
        DadosSaidaCirculo resultado = calculadora.calcularArea(entrada);
        resultado = calculadora.calcularCircunferencia(entrada);
       
        
        System.out.printf("Area: %.2f%n", resultado.getArea());
        System.out.printf("Circunferencia: %.2f%n", resultado.getCircunferencia());
        
        
        sc.close();
    }
}
