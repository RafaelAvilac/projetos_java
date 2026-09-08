/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_polimorfismoherancasobre_poo1.models;

/**
 *
 * @author Iftm
 */
public class PessoaFisica extends Pessoa
{
   private String cpf;
   private String rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
   @Override
    public String cadastrar()
    {
        //System.out.println("Pessoa Fisica");
        return "Nome: "+super.getNome()+" CPF: "+this.getCpf()+" RG: "+this.getRg();
    }
   
}
