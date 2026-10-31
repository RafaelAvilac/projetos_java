/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_exemplo_bancodedados_poo1.bo;

import com.poo.prj_exemplo_bancodedados_poo1.dao.PessoaDAO;
import com.poo.prj_exemplo_bancodedados_poo1.models.Pessoa;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author user
 */
public class PessoaBO 
{
    PessoaDAO pDAO;

    public PessoaBO() 
    {
        pDAO = new PessoaDAO();
    }
    
    public Pessoa salvar(Pessoa p)
    {
        if(p.getCpf().length() == 11)
        {
            return pDAO.salvar(p);
        }
        else
        {
            System.out.println("CPF incorreto");
            p.setId_pessoa(-1);
            return p;
        }
    }
    
    public List<Pessoa> getPessoas()
    {
        return pDAO.getPessoas();
    }   
    
    public void mostrarDados(Pessoa pessoa)
    {
        System.out.println("ID: " + pessoa.getId_pessoa() + 
                                               " | Nome: " + pessoa.getNome() + 
                                               " | CPF: " + pessoa.getCpf() + 
                                               " | Idade: " + pessoa.getIdade());
    }
    
    public void excluir(Pessoa p)
    {
        pDAO.excluir(p);
    }
}
