
package program.app1;


public class App1 {

    public static void main(String[] args) {
       Personagem heroi = new Personagem();
       
       heroi.nome = "Hercule";
       heroi.nivel = 2;
       heroi.forca = 16;
       
       heroi.mostrarStatus();
       heroi.atacar("Mostro", "bola de gelo");
       
        System.out.println(heroi.calcularDano());
       
    }
}
