

package program.sistemaBancario.services;

public class ContaBancaria{
    
    private static final double TAXA_SAQUE = 5.0;
    
    private String titular;
    private final int numero;
    private double saldo;

    public ContaBancaria(String titular, int numero, double quantia) {
        this.titular = titular;
        this.numero = numero;
        depositar(quantia);
    }

    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double quantia){
        
        saldo += quantia;
    
    }
 
   public void sacar(double quantia){
       
       saldo -= quantia + TAXA_SAQUE; 
   
   }

    @Override
    public String toString() {
         return "Conta: "
                + numero 
                + "\nTitular: " 
                + titular
                + "\nSaldo: R$ " 
                + String.format("%.2f", saldo);
    }
   
  
}
