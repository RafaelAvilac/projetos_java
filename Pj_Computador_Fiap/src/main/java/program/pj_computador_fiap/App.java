
package program.pj_computador_fiap;

public class App {
    
    public static void main(String[] args){
        
        Computador computador = new Computador("vostro", "Dell", 500, 16, 1000, "AMD", true, new Fabricante("Dell Company", "Av. Paulista")); 
        
        System.out.println("Modelo: " + computador.getModelo());
       
    }
}
