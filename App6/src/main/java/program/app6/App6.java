
package program.app6;

import program.app6.models.Cachorro;
import program.app6.models.Dragao;
import program.app6.models.Gato;
import program.app6.models.Pombo;

public class App6 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("AUAU");
        cachorro.comer();
        cachorro.lamber();
        cachorro.latir();
        
        Gato gato = new Gato("Lili");
        
        gato.miar();
        
        Dragao dragao = new Dragao("Dragon");
        dragao.voar();
        dragao.soltaFogo();
       
        Pombo pombo = new Pombo("Pombo sedex");
        pombo.enviarCarta();
        pombo.fazerPruh();
    }
}
