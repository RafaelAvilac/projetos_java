

package program.prj_calculadoradeimc;

import java.util.Scanner;
import program.prj_calculadoradeimc.models.Entrada;
import program.prj_calculadoradeimc.models.Saida;


public class Prj_CalculadoraDeImc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Entrada ent = new Entrada();
        Saida sa = new Saida();
        CalcularImc calc = new CalcularImc();
        
        System.out.print("Informe peso em Kg: ");
        double peso = sc.nextDouble();
        ent.setPeso(peso);
        
        System.out.print("Informe altura em metros: ");
        double altura = sc.nextDouble();
        ent.setAltura(altura);
        
       calc.calcular(ent, sa);
        
       System.out.printf("\n===== RESULTADO =====\n");
       System.out.printf("Seu IMC eh: %.2f\n", sa.getResultadoImc());
       System.out.println("=====================");
        
        sc.close();
    }
}
