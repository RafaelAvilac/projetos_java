
package program.geometriadocirculo.services;

import program.geometriadocirculo.models.DadosEntradaCirculo;
import program.geometriadocirculo.models.DadosSaidaCirculo;


public class CalculadoraCirculo {
    
    private DadosSaidaCirculo ds = new DadosSaidaCirculo();
    
    public DadosSaidaCirculo calcularArea(DadosEntradaCirculo de){
     
        double area = Math.PI * Math.pow(de.getRaio(), 2);
        ds.setArea(area);
        return ds;

    }
    public DadosSaidaCirculo calcularCircunferencia(DadosEntradaCirculo de){
    
        double circunferencia = 2 * Math.PI * de.getRaio();
        ds.setCircunferencia(circunferencia);
        return ds;
    
    }
}
