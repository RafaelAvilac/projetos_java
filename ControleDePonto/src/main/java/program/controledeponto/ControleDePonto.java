
package program.controledeponto;

import java.util.Locale;
import java.util.Scanner;
import program.controledeponto.services.Funcionario;

public class ControleDePonto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario;
        
        System.out.print("Informe a matricula: ");
        String matricula = sc.nextLine();
        
        System.out.print("Informe o nome: ");
        String  nome = sc.nextLine();
       
        
        System.out.print("Deseja informar saldo de horas extras 1/sim 2/nao: ");
        int opcao = sc.nextInt();
        
        if(opcao == 1){
            
            System.out.print("Saldo de horas atual: ");
            double horas = sc.nextDouble();
            funcionario = new Funcionario(matricula, nome,horas);
        }else{
            
            funcionario = new Funcionario(matricula, nome);
        }
        System.out.println(funcionario);
        
        System.out.println("Informe horas extras: ");
        double horas = sc.nextDouble();
        System.out.println(funcionario);
        funcionario.adicionarHora(horas);
        
        System.out.println("Informe horas extras: ");
        horas = sc.nextDouble();
        System.out.println(funcionario);
        funcionario.adicionarHora(horas);
        
        System.out.println("1 conpensacao de hora: ");
        horas = sc.nextDouble();
        if( funcionario.reduzirHoras(horas)){
            System.out.println("Horas compensadas");
        }else{
            System.out.println("Horas nao compensadas");
        }
       
          System.out.println("2 conpensacao de hora: ");
        horas = sc.nextDouble();
        if( funcionario.reduzirHoras(horas)){
            System.out.println("Horas compensadas");
        }else{
            System.out.println("Horas nao compensadas");
        }
        System.out.println(funcionario);
        
        
        
        
        
        sc.close();
    }
}
