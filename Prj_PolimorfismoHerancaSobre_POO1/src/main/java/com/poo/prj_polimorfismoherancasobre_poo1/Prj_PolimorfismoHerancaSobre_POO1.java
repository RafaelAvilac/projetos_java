

package com.poo.prj_polimorfismoherancasobre_poo1;

import com.poo.prj_polimorfismoherancasobre_poo1.models.Pessoa;
import com.poo.prj_polimorfismoherancasobre_poo1.models.PessoaFisica;
import com.poo.prj_polimorfismoherancasobre_poo1.models.PessoaJuridica;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;


public class Prj_PolimorfismoHerancaSobre_POO1 {

    public static void main(String[] args) throws FileNotFoundException {
        
        // EXEMPLO DE SOBRECARGA
        /*ExemploSobrecarga es1 = new ExemploSobrecarga();
        
        ExemploSobrecarga es2 = new ExemploSobrecarga("Teste 1", "Teste 2");
        
        System.out.println("Resultado: "+es1.somar(3, 5));
        System.out.println("Resultado: "+es1.somar(3, 5, 2));
        System.out.println("Resultado: "+es1.somar(3.0, 5.0));
        System.out.println("Resultado: "+es1.somar(3, 5.0));
        System.out.println("Resultado: "+es1.somar(3.0, 5)); */
        
        /*Pessoa p = new PessoaFisica();
        Pessoa p1 = new PessoaJuridica();
        
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        
        Pessoa p2 = new Pessoa();
        p2 = pf;
        p2 = pj;*/
        
        
        /* AULA NOVA ou outra AULA 24/08/2026
        Pessoa p1 = new Pessoa();
        
        PessoaFisica pf = new PessoaFisica();
        
        pf.setNome("Teste PF");
        pf.setCpf("12345678900");
        pf.setRg("MG1111111");
        
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.setNome("Teste PJ");
        pj.setCnpj("12345678912345");
        pj.setInscricaoEstadual("67576567586");
        
        Pessoa p2;
        //p2 = pf;
        p2 = pj;
        
        p1.cadastrar();
        
        p2.cadastrar();
        
        System.out.println(p2.getNome());
        
        if(p2 instanceof PessoaFisica pf2)
        {
            System.out.println(pf2.getCpf());
            System.out.println(pf2.getRg());
            pf2.cadastrar();
        }
        else
        {
            PessoaJuridica pj2 = (PessoaJuridica) p2;
            System.out.println(pj2.getCnpj());
            System.out.println(pj2.getInscricaoEstadual());
            pj2.cadastrar();
        }*/
        
        /*Aula dia 26/08/2026
        MostrarDados md = new MostrarDados();
        
        PessoaFisica pf = new PessoaFisica();
        
        pf.setNome("Teste PF");
        pf.setCpf("12345678900");
        pf.setRg("MG1111111");
        
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.setNome("Teste PJ");
        pj.setCnpj("12345678912345");
        pj.setInscricaoEstadual("67576567586");
        
        //Pessoa p2;
        //p2 = pf;
        
        //md.mostrar(pf);
        md.mostrar(pj);
        //md.mostrar(p2);*/
        
        
        // AULA DIA 31/08/2026
        
        /*PessoaFisica pf = new PessoaFisica();
        pf.setNome("Teste PF");
        pf.setCpf("12345678900");
        pf.setRg("MG1111111");
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Teste PJ");
        pj.setCnpj("12345678912345");
        pj.setInscricaoEstadual("67576567586");
        
        GravarArquivo ga = new GravarArquivo();
        ga.escreverArq(pf);
        ga.escreverArq(pj);*/
        
        BuscarArquivo ba = new BuscarArquivo();
        
        System.out.println(ba.lerArq());
 
        
        
        
        
    }
}
