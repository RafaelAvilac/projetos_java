package program.mediaponderada;

import java.util.Locale;
import java.util.Scanner;
import program.mediaponderada.models.DadosEntradaNotas;
import program.mediaponderada.models.DadosSaidaNotas;
import program.mediaponderada.services.CalculadoraNotas;

public class MediaPonderada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DadosEntradaNotas de = new DadosEntradaNotas();
        
        CalculadoraNotas calcular = new CalculadoraNotas();
        
        System.out.print("Informe nota1: ");
        de.setNota1(sc.nextDouble());
        System.out.print("Informe peso1: ");
        de.setPeso1(sc.nextDouble());
        
        System.out.print("Informe nota2: ");
        de.setNota2(sc.nextDouble());
        System.out.print("Informe peso2: ");
        de.setPeso2(sc.nextDouble());
        
        System.out.print("Informe nota3: ");
        de.setNota3(sc.nextDouble());
        System.out.print("Informe peso3: ");
        de.setPeso3(sc.nextDouble());
        
        DadosSaidaNotas resultado = calcular.calcularMedia(de);
        resultado = calcular.definirSituacao(de);
        
        System.out.printf("media: %.2f%n", resultado.getMedia());
        System.out.print("Situcao: " + resultado.getSituacao());
        
       
        sc.close();
    }
}
