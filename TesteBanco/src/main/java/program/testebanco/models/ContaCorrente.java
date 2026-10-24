
package program.testebanco.models;

public class ContaCorrente extends Conta {
    
    private double taxaManutencao;

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    
    @Override
    public double calcularSaldoFinal(){
    
        return getSaldo() - taxaManutencao;
    
    }
    
}
