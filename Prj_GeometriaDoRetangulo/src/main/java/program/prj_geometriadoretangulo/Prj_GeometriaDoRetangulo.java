package program.prj_geometriadoretangulo;

import java.util.Scanner;
import program.prj_geometriadoretangulo.bo.CalculadoraRetangulo;
import program.prj_geometriadoretangulo.models.Entrada;
import program.prj_geometriadoretangulo.models.Saida;

public class Prj_GeometriaDoRetangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Entrada dados = new Entrada();
      
        System.out.print("Informe a base do retangulo: ");
        dados.setBase(sc.nextDouble());
        
        System.out.print("Informe a altura do retangulo: ");
        dados.setAltura(sc.nextDouble());
        
        CalculadoraRetangulo calculadora = new CalculadoraRetangulo(dados);
        Saida resultado = calculadora.calcular();
        
        resultado.exibirResultado();
        
        sc.close();
    }
}
