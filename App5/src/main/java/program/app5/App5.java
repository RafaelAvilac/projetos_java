
package program.app5;

import java.util.ArrayList;

public class App5 {

    public static void main(String[] args) {
        //ArrayList<Tipo> nome = new ArrayList<Tipo>();
        
       
        // ArrayList não permite tipos primitivos, apenas classes.
        /*
            Tipo Primitivo  ->  Wrapper Class
            int             ->  Integer
            float           ->  Float
            double          ->  Double
            char            ->  Character  
        
        */
        ArrayList<String> nome = new ArrayList<String>();
        
        nome.add("Goku");  // indice 0
        nome.add("Maria"); // indice 1
        nome.add("Pedro"); // indice 2
        nome.add("Goku");  // indice 3
        nome.add("Bob");   // indice 4
        nome.add("Amora"); // indice 5
        
        System.out.println("Imprimindo ArrayList\n");
        
       /* for(int i = 0; i < nome.size(); i++){
            System.out.println("Nome: " + nome.get(i));
        }*/
       
       for(String list : nome ){
           System.out.println(list);
       }
        
       
       
    }
}
