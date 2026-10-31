
package program.app6.models;

public class Dragao extends Ave{

    public Dragao(String nome) {
        super(nome);
    }

    public void soltaFogo(){
        System.out.printf("%s soltou uma bola de fogo\n", getNome());
    
    }
    
}
