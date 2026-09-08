package program.mavenproject1;

import java.util.Scanner;
import program.mavenproject1.boo.CalculadoraTemperatura;
import program.mavenproject1.models.DadosEntradaTemperatura;
import program.mavenproject1.models.DadosSaidaTemperatura;

public class Mavenproject1 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        DadosEntradaTemperatura dados = new DadosEntradaTemperatura();
        DadosSaidaTemperatura saida = new DadosSaidaTemperatura();
        
        
        System.out.print("Informe a temperatura em celsius: ");
        dados.setCelsius(sc.nextDouble());
        
        CalculadoraTemperatura calculadora = new CalculadoraTemperatura();
        calculadora.converter(dados, saida);
        
        System.out.printf("A temperatura %.2f em Fahrenheit é: %.2f%n", dados.getCelsius(), saida.getFahrenheit());
        System.out.printf("A temperatura %.2f em Kelvin é: %.2f%n", dados.getCelsius(), saida.getKelvin());
        
        sc.close();
    }
}
