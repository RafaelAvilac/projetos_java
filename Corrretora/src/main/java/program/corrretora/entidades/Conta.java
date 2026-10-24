
package program.corrretora.entidades;


public class Conta {
    
    private int numero;
    private String titular;
    protected double saldo;

    public Conta() {
    }

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumber() {
        return numero;
    }

    public void setNumber(int number) {
        this.numero = numero;
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

    public void retira(double quantia ){
    
        saldo -= quantia;
    
    }
    
    public void deposito(double quantia){
        
        saldo += quantia;
    
    }
    
    
    
}
