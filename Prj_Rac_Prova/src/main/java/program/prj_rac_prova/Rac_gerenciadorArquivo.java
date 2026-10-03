
package program.prj_rac_prova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import program.prj_rac_prova.models.Rac_midia;


public class Rac_gerenciadorArquivo {
    public void salvarArquivo(Rac_midia m){
    
        try(FileWriter fw = new FileWriter("catalogo.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
           pw.println(m.formatarDados());
    
         } catch(IOException e){
             System.out.println("ERRO" + e.getMessage());
         } 
    }
    public void lerArquivo(){
        try(FileReader fr = new FileReader("catalogo.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            
            }
        
        }catch(IOException e){
            System.out.println("Erro ao ler aquivo" + e.getMessage());
        
        }
    
    
    }
    
    
}
