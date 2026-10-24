package program.calculadorajuros.services;

import program.calculadorajuros.models.DadosEntradaConta;
import program.calculadorajuros.models.DadosSaidaConta;

public class CalculadoraConta {
    
    public void calcular(DadosEntradaConta entrada, DadosSaidaConta saida){
    
        double saldo = entrada.getSaldoInicial();
        
        for(int i = 1; i <= entrada.getMeses(); i++){
            
           saldo = saldo * (1 + entrada.getTaxaJurosMensal());
        
        }
        
        saida.setSaldoFinal(saldo);
       
        double totalJuros = saida.getSaldoFinal() - entrada.getSaldoInicial();
       
        saida.setTotalJuros(totalJuros);
        
    }
    
}
