
package program.corrretora.entidades;

public class ContaPoupanca extends Conta {
    
    private double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double taxaJuros, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void autalizarSaldo(){
    
        saldo += saldo * taxaJuros;
    
    }
    
}
