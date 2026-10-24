
package program.corrretora.entidades;


public class ContaJuridica extends Conta {
    
    private double limiteEmprestimo;

    public ContaJuridica() {
        super();
    }

    public ContaJuridica(double limiteEmprestimo, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void limite(double quantia){
        if (quantia <= limiteEmprestimo){
            saldo += quantia - 10;
        }
    } 
    
    
}
