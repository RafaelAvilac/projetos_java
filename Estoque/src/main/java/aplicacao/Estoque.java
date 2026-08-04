
package aplicacao;

import entidade.Produto;
import java.util.Scanner;
import java.util.Locale;


public class Estoque {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();
        
        System.out.println();
        System.out.println("Produto em estoque: " + produto);
        
        System.out.println();
        System.out.print("Digite a quantidade de produto para adicionado ao estoque: ");
        
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        
        System.out.println("Estoque atualizado: " + produto);
         
        System.out.println();
        System.out.print("Digite a quantidade de produto para removidos do estoque: ");
        
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);
        
        System.out.println("Estoque atualizado: " + produto);
        
        sc.close();
    }
}
