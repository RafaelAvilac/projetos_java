package program.salario_liquido.models;

public class DadosSaidaSalario {
    
    private double salarioLiquido;
    private double totalDescontos;

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getTotalDesconto() {
        return totalDescontos;
    }

    public void setTotalDesconto(double totalDesconto) {
        this.totalDescontos = totalDesconto;
    }
    
    
}
