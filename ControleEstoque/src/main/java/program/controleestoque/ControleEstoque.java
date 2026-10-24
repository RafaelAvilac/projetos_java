
package program.controleestoque;

import java.util.Locale;
import java.util.Scanner;
import program.controleestoque.services.Produto;

public class ControleEstoque {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto;
        
        
        System.out.print("Digite o cod do produto: ");
        int cod = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
       
       
        System.out.print("Deseja inserir quantidade 1/sim 2/nao: ");
        int opcao = sc.nextInt();
        
        if(opcao == 1){
            System.out.print("digite a quantidade: ");
            int qtd = sc.nextInt();
            produto = new Produto(cod, nome, qtd);
        }else{
        
            produto = new Produto(cod, nome);
        }
        System.out.println(produto);
        
        System.out.print("Registre uma entrada do produto cadastrado: ");
        int qtd = sc.nextInt();
        produto.registrarEntrada(qtd);
    
        System.out.println(produto);
       
        for(int i=0; i<2;i++){
            
            System.out.print("Registre uma retirada do produto cadastrado: ");
            qtd = sc.nextInt();
            if(produto.registrarSaida(qtd)){
                System.out.println("Retirada efetuada");
             
            }else{
                System.out.println("Retirada nao efetuada");
            }
        System.out.println(produto);
        }
        
        sc.close();
    }
}
