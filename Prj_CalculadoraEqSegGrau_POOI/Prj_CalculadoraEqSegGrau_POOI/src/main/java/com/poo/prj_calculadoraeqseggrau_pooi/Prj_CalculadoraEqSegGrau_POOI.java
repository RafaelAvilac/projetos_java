package com.poo.prj_calculadoraeqseggrau_pooi;

import com.poo.prj_calculadoraeqseggrau_pooi.bo.CalculoEqSegGrau;
import com.poo.prj_calculadoraeqseggrau_pooi.bo.CalculoEqSegGrau_2;
import com.poo.prj_calculadoraeqseggrau_pooi.models.DadosEntrada;
import com.poo.prj_calculadoraeqseggrau_pooi.models.DadosSaida;

public class Prj_CalculadoraEqSegGrau_POOI {

    public static void main(String[] args) {
        
        DadosEntrada de = new DadosEntrada();
        de.setA(1);
        de.setB(5);
        de.setC(6);
        
        /*CalculoEqSegGrau esg = new CalculoEqSegGrau();
        
        DadosSaida ds;
        esg.calcularDelta(de);
        esg.calcularX1L(de);
        esg.calcularX2L(de);
        esg.calcularXv(de);
        ds = esg.calcularYv(de);*/
       
        CalculoEqSegGrau_2 esg = new CalculoEqSegGrau_2();
        
        DadosSaida ds = new DadosSaida();
        esg.calcularDelta(de, ds);
        esg.calcularX1L(de, ds);
        esg.calcularX2L(de, ds);
        esg.calcularXv(de, ds);
        esg.calcularYv(de, ds);
        
        System.out.println("Delta: "+ds.getDelta());
        System.out.println("x': "+ds.getX1L());
        System.out.println("x'': "+ds.getX2L());
        System.out.println("xV: "+ds.getxV());
        System.out.println("yV: "+ds.getyV());

    }
}
