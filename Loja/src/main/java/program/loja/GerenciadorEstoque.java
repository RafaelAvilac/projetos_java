
package program.loja;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import program.loja.models.Produto;

public class GerenciadorEstoque {
    
    public void salvarProduto(Produto p ){
        try(FileWriter fw = new FileWriter("estoque.txt",true);    
            PrintWriter pw = new PrintWriter(fw)){
            pw.println(p.gerarLinhaArquivo());
       
            }catch(IOException e){
    
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
    
    public void listarProduto( ){
        
        try(FileReader fr = new FileReader("estoque.txt");
                BufferedReader br = new BufferedReader(fr)){
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            } 
        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
 
}
