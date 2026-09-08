package program.mavenproject1.boo;

import program.mavenproject1.models.DadosEntradaTemperatura;
import program.mavenproject1.models.DadosSaidaTemperatura;

public class CalculadoraTemperatura {
    
    public void converter(DadosEntradaTemperatura entrada, DadosSaidaTemperatura saida){
    
       double fahrenheit = entrada.getCelsius() * 9 /5 + 32;
       double kelvin = entrada.getCelsius() + 273.15;
       
       saida.setFahrenheit(fahrenheit);
       saida.setKelvin(kelvin);
    
    }
    
}
