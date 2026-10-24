package program.salario_liquido.models;

public class DadosEntradaSalario {
    
    private double salarioBruto;
    private double descontoINSS;
    private double descontoIR;

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public double getDescontoIR() {
        return descontoIR;
    }

    public void setDescontoIR(double descontoIR) {
        this.descontoIR = descontoIR;
    }
   
}
