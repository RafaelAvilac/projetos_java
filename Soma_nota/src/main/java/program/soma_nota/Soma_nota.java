package program.soma_nota;

import java.util.Locale;
import java.util.Scanner;


public class Soma_nota {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int qtd;
        
        System.out.print("Quantidade de alunos para verificar: ");
        qtd = sc.nextInt();
        
        double somaNota = 0;
        
        for(int i = 0; i < qtd; i++){
            System.out.printf("Digite a nota do %d aluno: ", i+1);
            double nota = sc.nextDouble();
            
            if(nota < 0 || nota > 10){
                System.out.println("Nota Invalida");
                i--;
            }else{
                somaNota += nota;
            }
        }
        
        double media = somaNota / qtd;
        
        System.out.println("Media: "+ media);
        
        sc.close();
    }
}
