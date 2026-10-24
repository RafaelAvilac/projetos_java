
package program.app2.modelos;

public class Conta {
    
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double valor){
        
        if(valor < 0 ){
            System.out.println("Nao permitido valor negativo");
        }else{
            saldo += valor;
        }
    
    
    }
    
}
