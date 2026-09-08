/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_polimorfismoherancasobre_poo1.models;

/**
 *
 * @author Iftm
 */
public class PessoaJuridica extends Pessoa
{
    private String cnpj;
    private String inscricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
   @Override
    public String cadastrar()
    {
        //System.out.println("Pessoa Juridica");
        return "Nome: "+super.getNome()+" CNPJ: "+this.getCnpj()+" Inscr. Estadual: "+this.getInscricaoEstadual();
    }
    
}
