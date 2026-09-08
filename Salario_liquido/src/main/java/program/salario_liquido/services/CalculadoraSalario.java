package program.salario_liquido.services;

import program.salario_liquido.models.DadosEntradaSalario;
import program.salario_liquido.models.DadosSaidaSalario;

public class CalculadoraSalario {
    
    public void calcular(DadosEntradaSalario entrada, DadosSaidaSalario saida){
    
        double totalDesc = entrada.getDescontoINSS() + entrada.getDescontoIR();
        double salarioLiq = entrada.getSalarioBruto() - totalDesc;
        
        saida.setTotalDesconto(totalDesc);
        saida.setSalarioLiquido(salarioLiq);
    }
    
}
