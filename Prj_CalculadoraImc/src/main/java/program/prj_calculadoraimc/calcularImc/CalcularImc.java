package program.prj_calculadoraimc.calcularImc;

import program.prj_calculadoraimc.DadosEntradaImc.DadosEntrada;
import program.prj_calculadoraimc.DadosSaidaIMC.DadosSaidaImc;

public class CalcularImc {
    

    public void calcular(DadosEntrada entrada, DadosSaidaImc saida) {
        
        double imc = entrada.getPeso() / (entrada.getAltura() * entrada.getAltura());
        
      
        saida.setResultadoImc(imc);
    }
}
