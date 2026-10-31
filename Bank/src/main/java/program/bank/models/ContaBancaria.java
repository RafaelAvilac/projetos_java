

package program.bank.models;

public class ContaBancaria {
    
    private String titular;
    private final int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.printf("Deposito de R$%.2f realizado!\n", valor);
        }else{
            System.out.println("Valor invalido para deposito\n");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado!\n",valor);
        }else{
            System.out.println("Saldo insuficiente ou valor invalido\n");
        }
    }
    public void consultarSaldo(){
        System.out.printf("Saldo atual de %s: R$%.2f\n", titular, saldo);
    }
   public void exibirDados(){
       System.out.printf("Titular: %s\nConta: %d\nSaldo: R$ %.2f\n",
               titular, numeroConta, saldo);
       System.out.printf("------------------------\n");
   
   }
    
    
}
