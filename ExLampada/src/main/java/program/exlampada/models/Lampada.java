
package program.exlampada.models;

public class Lampada {
    private String marca;
    private double potencia;
    private String tipo;
    private boolean ligada;

    public Lampada(String marca, double potencia, String tipo, boolean ligada) {
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    
}
