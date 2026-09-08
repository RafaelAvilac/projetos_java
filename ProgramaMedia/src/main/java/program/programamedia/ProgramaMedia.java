
package program.programamedia;

import java.util.Locale;
import java.util.Scanner;
import program.programamedia.utilitarios.Dados;

public class ProgramaMedia {

    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      Dados x = new Dados();
      
        System.out.print("Nome: ");
        x.nome = sc.nextLine();
        
        System.out.print("Nota 1: ");
        x.nota1 = sc.nextDouble();
        
        System.out.print("Nota 2: ");
        x.nota2 = sc.nextDouble();
        
        System.out.print("Nota 3: ");
        x.nota3 = sc.nextDouble();
      
      
      sc.close();
    }
}
