
package program.prj_polimorfismoherancasobre_poo1;

import program.prj_polimorfismoherancasobre_poo1.models.Pessoa;
import program.prj_polimorfismoherancasobre_poo1.models.PessoaFisica;
import program.prj_polimorfismoherancasobre_poo1.models.PessoaJuridica;

public class Prj_PolimorfismoHerancaSobre_POO1 {

    public static void main(String[] args) {
       
        ExemploSobrecarga es1 = new ExemploSobrecarga();
        
        //ExemploSobrecarga es2 = new ExemploSobrecarga("Teste1", "Teste2");
        
        /*System.out.println("Resultado: " + es1.somar(3, 5));
        System.out.println("Resultado: " + es1.somar(3, 5, 2));
        System.out.println("Resultado: " + es1.somar(3, 5.0));
        System.out.println("Resultado: " + es1.somar(3,5.0));
        System.out.println("Resultado: " + es1.somar(5.0, 2));*/
        
        
        /*Pessoa p = new PessoaFisica();
        Pessoa p1 = new PessoaJuridica();
        
        Pessoa pf = new PessoaFisica();
        Pessoa pj = new PessoaJuridica();
        
        Pessoa p2 = new Pessoa();
        
        p2 = pf;
        p2 = pj;*/
        
        Pessoa p1 = new Pessoa();
        
        PessoaFisica pf = new PessoaFisica();
        
        pf.setNome("Teste Pf");
        pf.setCpf("12345678900");
        pf.setRg("MG1111111111");
        
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.setNome("Teste PJ");
        pj.setCnpj("123123123123123");
        pj.setInscricaoEstadual("67576557586");
        
        Pessoa p2;
        
        p2 = pf;
        //p2 = pj;
        
        
        p1.cadastrar();
        
        p2.cadastrar();
        
        System.out.println(p2.getNome());
        
        if(p2 instanceof PessoaFisica pf2){
        
            System.out.println(pf2.getCpf());
            System.out.println(pf2.getRg());
            pf2.cadastrar();
        
        }
        else{
            
            PessoaJuridica pj2 = (PessoaJuridica) p2;
            System.out.println(pj2.getCnpj());
            System.out.println(pj2.getInscricaoEstadual());
            pj2.cadastrar();
        }
    }
}
