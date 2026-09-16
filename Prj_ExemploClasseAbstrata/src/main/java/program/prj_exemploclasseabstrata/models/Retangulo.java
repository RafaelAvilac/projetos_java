package program.prj_exemploclasseabstrata.models;

public class Retangulo extends FomaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String nome, int altura, int largura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        
        return largura * altura;
    }
    
    
}
