
package com.poo.prj_calculadoraeqseggrau_pooi.bo;

import com.poo.prj_calculadoraeqseggrau_pooi.models.DadosEntrada;
import com.poo.prj_calculadoraeqseggrau_pooi.models.DadosSaida;

public class CalculoEqSegGrau_2 
{   
    public void calcularDelta(DadosEntrada de, DadosSaida ds)
    {
        double delta = (de.getB()*de.getB()) - 4*de.getA()*de.getC();
        ds.setDelta(delta);
        
    }
    
    public void calcularX1L(DadosEntrada de, DadosSaida ds)
    {
        
        double x1L = (-de.getB() + Math.sqrt(ds.getDelta())) / (2*de.getA());
        
        ds.setX1L(x1L);
        
    }
    
    public void calcularX2L(DadosEntrada de, DadosSaida ds)
    {
        ds.setX2L((-de.getB()-Math.sqrt(ds.getDelta()))/ (2*de.getA()));        
    }
    
    public void calcularXv(DadosEntrada de, DadosSaida ds)
    {
        ds.setxV(-de.getB() / (2*de.getA()));
        
    }

    public void calcularYv(DadosEntrada de, DadosSaida ds)
    {
        ds.setyV(-ds.getDelta() / (4*de.getA()));
        
    }     
        
}
