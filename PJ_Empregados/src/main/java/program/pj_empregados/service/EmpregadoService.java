
package program.pj_empregados.service;

import program.pj_empregados.Empregado;


public class EmpregadoService {
    public void concederAumento(Empregado empregado, double percent){
    
        empregado.setSalario(empregado.getSalario() * (1 + (percent / 100)));
    
    }
    
}
