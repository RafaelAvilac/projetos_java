package program.testebanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import program.testebanco.models.Conta;
import program.testebanco.models.ContaCorrente;
import program.testebanco.models.ContaPoupanca;

public class TesteBanco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        List<Conta> lista = new ArrayList<>();
        
      
        ContaPoupanca contaP = new ContaPoupanca();
        ContaCorrente contaC = new ContaCorrente();
        
      
        contaP.setTitular("Marcos Paulo");
        contaP.setSaldo(1000);
        contaP.setTaxaRendimento(0.05);
        
        contaC.setTitular("Ana Maria");
        contaC.setSaldo(1000);
        contaC.setTaxaManutencao(30);
        
      
        lista.add(contaP);
        lista.add(contaC);
        
        for(Conta c : lista){
              System.out.printf("Titular: %s%nSaldo Final: %.2f%n",
                      c.getTitular(), c.calcularSaldoFinal());
        
        }
    }
}
