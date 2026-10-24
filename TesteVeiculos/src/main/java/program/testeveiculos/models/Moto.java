
package program.testeveiculos.models;

public class Moto extends Veiculo{
    
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String descrever(){
    
        return "Moto: " + getModelo() + " - " + cilindrada + " cilindradas";
    
    }
    @Override
    public double calcularTempoViagem(double distancia){
        
        int paradas = (int)(distancia / 200); 
        
        return paradas * 0.5 + (distancia / getVelocidadeMaxima());
    }

}
