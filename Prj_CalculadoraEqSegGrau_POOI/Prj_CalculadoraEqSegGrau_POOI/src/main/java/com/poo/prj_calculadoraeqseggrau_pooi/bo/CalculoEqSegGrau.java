package com.poo.prj_calculadoraeqseggrau_pooi.bo;

import com.poo.prj_calculadoraeqseggrau_pooi.models.DadosEntrada;
import com.poo.prj_calculadoraeqseggrau_pooi.models.DadosSaida;

public class CalculoEqSegGrau 
{
    DadosSaida ds = new DadosSaida();
    
    public DadosSaida calcularDelta(DadosEntrada de)
    {
        double delta = (de.getB()*de.getB()) - 4*de.getA()*de.getC();
        ds.setDelta(delta);
        
        return ds;
    }
    
    public DadosSaida calcularX1L(DadosEntrada de)
    {
        
        double x1L = (-de.getB() + Math.sqrt(ds.getDelta())) / (2*de.getA());
        
        ds.setX1L(x1L);
        
        return ds;
    }
    
    public DadosSaida calcularX2L(DadosEntrada de)
    {
        ds.setX2L((-de.getB()-Math.sqrt(ds.getDelta()))/ (2*de.getA()));
        return ds;
        
    }
    
    public DadosSaida calcularXv(DadosEntrada de)
    {
        ds.setxV(-de.getB() / (2*de.getA()));
        return ds;
        
    }

    public DadosSaida calcularYv(DadosEntrada de)
    {
        ds.setyV(-ds.getDelta() / (4*de.getA()));
        return ds;
        
    }     
    
}
