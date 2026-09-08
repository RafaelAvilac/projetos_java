
package program.formasgeometricas.models;

public class Circulo extends Forma {
    
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
     public double calcularArea(){
        
        return Math.PI * (raio * raio);
    
    }
    
}
