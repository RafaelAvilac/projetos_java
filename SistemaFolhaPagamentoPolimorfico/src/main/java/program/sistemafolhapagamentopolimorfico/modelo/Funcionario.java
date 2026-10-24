
package program.sistemafolhapagamentopolimorfico.modelo;

public class Funcionario {
    private String nome;
    private double salarioBase;
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    // Método de negócio
    public double calcularSalario() {
        return salarioBase;
    }
}