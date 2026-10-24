/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_polimorfismoherancasobre_poo1;

import com.poo.prj_polimorfismoherancasobre_poo1.models.Pessoa;
import com.poo.prj_polimorfismoherancasobre_poo1.models.PessoaFisica;
import com.poo.prj_polimorfismoherancasobre_poo1.models.PessoaJuridica;

/**
 *
 * @author Iftm
 */
public class MostrarDados 
{
    /*public void mostrar(PessoaFisica pf)
    {
        System.out.println(pf.getNome());
        System.out.println(pf.getCpf());
        System.out.println(pf.getRg());
    }
    
    public void mostrar(PessoaJuridica pj)
    {
        System.out.println(pj.getNome());
        System.out.println(pj.getCnpj());
        System.out.println(pj.getInscricaoEstadual());
    }*/
    
    public void mostrar(Pessoa p)
    {
        System.out.println(p.getNome());
        if(p instanceof PessoaFisica pf)
        {
            System.out.println(pf.getCpf());
            System.out.println(pf.getRg());
        }
        else
        {
            PessoaJuridica pj = (PessoaJuridica) p;
            System.out.println(pj.getCnpj());
            System.out.println(pj.getInscricaoEstadual());
        }
    }
}
