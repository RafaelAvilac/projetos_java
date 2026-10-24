
package program.app1;

import java.util.Random;


public class Personagem {
    String nome;
    int nivel;
    int forca;
    
    
    // void sgnifica que nao esta retornando 
    void mostrarStatus(){
        System.out.printf("Personagem: %s, nivel %d, força %d\n",
                           nome, nivel, forca);
       
    }
    
    int calcularDano(){
    
        Random gerador = new Random();
        
        int dado20faces = 1 + gerador.nextInt(19);
        
        int dano = forca + dado20faces;
        
        return dano;
    }
    
    // metodo que não retorna nada e recebe um parametro alvo do tipo String
    void atacar(String alvo, String habilidade){
        
        int danoCausado = calcularDano();
        if(habilidade.length() == 0){
            
            System.out.printf("%s atacou %s e causou %d de danos\n",
                nome, alvo, danoCausado);
        }else {
            System.out.printf("%s usou %s contra o %s e causou %d de danos\n",
                nome, habilidade, alvo, danoCausado);
        }
        
    
    }
    
}
