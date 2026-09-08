
package program.prj_calculadoradeimc;

import program.prj_calculadoradeimc.models.Entrada;
import program.prj_calculadoradeimc.models.Saida;


public class CalcularImc {
       
    public void calcular(Entrada entrada, Saida saida) {
       
        double imc = entrada.getPeso() / (entrada.getAltura() * entrada.getAltura());
        
        saida.setResultadoImc(imc);
    }
}
