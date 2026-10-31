
package program.app6.models;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        this.cartasEnviadas = 10;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
    
    public void fazerPruh(){
        System.out.printf("%s fez pruh\n", getNome());
    }
    public void enviarCarta(){
        System.out.printf("%s enviou uma carta\n", getNome());
        this.cartasEnviadas++;
    }
}
