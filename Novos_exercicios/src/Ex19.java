
import java.util.Scanner;
import java.util.Locale;
public class Ex19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double peso, altura, resultado;
        String retorno;

        System.out.print("Digite o peso: ");
        peso = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();
        resultado = calcularIMC(peso, altura) ;
        System.out.printf("IMC = %.2f%n",resultado);
        retorno = classificarIMC(resultado);
        System.out.println(retorno);
        sc.close();
    }
    public static double calcularIMC(double peso, double altura){
        return (peso/(altura*altura));
    }
    public static String classificarIMC(double resultado){
        String classificacao;
        if (resultado < 18.5){
          classificacao = "Abaixo do peso";
        }else if (resultado <= 24.90){
            classificacao ="Peso normal";
        }else if (resultado <= 29.90){
            classificacao = "Sobrepeso";
        }else {
            classificacao = "Obesidade";
        }
        return classificacao;
    }
}
