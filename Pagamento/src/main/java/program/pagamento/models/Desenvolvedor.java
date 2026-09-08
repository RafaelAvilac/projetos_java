package program.pagamento.models;

public class Desenvolvedor extends Funcionario {
    
    private int horasExtras;
    private double valorHoraExtra;

    public Desenvolvedor() {
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }
}
