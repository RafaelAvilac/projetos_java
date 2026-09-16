package program.prj_exemploclasseabstrata.models;

public abstract class FomaGeometrica {
    
    private String nome;

    public FomaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public abstract double calcularArea();
    
}
