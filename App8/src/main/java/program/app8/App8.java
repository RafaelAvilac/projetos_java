
package program.app8;

import program.app8.models.Arqueiro;
import program.app8.models.Personagem;

public class App8 {

    public static void main(String[] args) {
        Personagem personagem = new Personagem("Joao");
        System.out.println(personagem);
        
        Arqueiro arqueiro = new Arqueiro("Leo");
        System.out.println(arqueiro);
        
        arqueiro.atacar();
        arqueiro.atacarSemArma();
    }
}
