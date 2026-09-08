
package program.testeveiculos.models;


public class Veiculo {
    
    private String modelo;
    private double velocidadeMaxima;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public double calcularTempoViagem(double distancia){
    
        return distancia / velocidadeMaxima;
    }
    public String descrever(){
    
       return "Veiculo: " + modelo;
    
    }
}
