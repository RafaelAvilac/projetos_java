package program.prj_exemploclasseabstrata.models;

public class Circulo extends FomaGeometrica {
    
    private double raio;

    public Circulo(String nome, int raio) {
        super(nome);
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    
    }
}
