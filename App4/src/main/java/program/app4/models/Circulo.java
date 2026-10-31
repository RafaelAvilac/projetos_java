
package program.app4.models;

import static java.lang.Math.PI;

public class Circulo implements FiguraGeometrica {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
    
        return PI * raio * raio;
    
    }
    
}
