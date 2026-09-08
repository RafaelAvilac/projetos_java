/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_polimorfismoherancasobre_poo1.models;

/**
 *
 * @author Iftm
 */
public class Pessoa 
{
    private String nome;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public String cadastrar()
    {
        //System.out.println("Pessoa");
        return "Nome: "+this.getNome();
    }
    
}
