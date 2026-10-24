
package program.locadora;

import java.util.Locale;
import java.util.Scanner;
import program.locadora.services.Veiculo;

public class Locadora {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a placa do veiculo: ");
        String placa = sc.nextLine();
        System.out.print("Informe o modelo do veiculo: ");
        String modelo = sc.nextLine();
        
        System.out.println("Deseja informar a quilometragem - 1/sim 2/nao: ");
        int opcao = sc.nextInt();
        
        Veiculo veiculo;
        
        if(opcao == 1){
            
            System.out.print("Informe a Quilometragem: ");
            double km = sc.nextDouble();
            
            veiculo = new Veiculo(placa,modelo, km);
        
        }else{
              
            veiculo = new Veiculo(placa, modelo);
        
        }
        System.out.println(veiculo);
        
        System.out.print("Quantos km foram rodados na primeira viagem: ");
        double km = sc.nextDouble();
        veiculo.registrarViagem(km);
        System.out.println(veiculo);
        
        System.out.print("Quantos km foram rodados na segunda viagem: ");
        km = sc.nextDouble();
        veiculo.registrarViagem(km);
        System.out.println(veiculo);
        
        System.out.println( );
        System.out.println("Quantos dias de aluguel");
        int dias = sc.nextInt();
        System.out.println(veiculo);
        System.out.printf("Valor aluguel: %,.2f", veiculo.calcularAluguel(dias));
        
        sc.close();
    }
}
