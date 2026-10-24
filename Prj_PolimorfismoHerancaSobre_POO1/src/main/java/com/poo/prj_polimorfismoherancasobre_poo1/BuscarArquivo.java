package com.poo.prj_polimorfismoherancasobre_poo1;

import com.poo.prj_polimorfismoherancasobre_poo1.models.PessoaFisica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;


public class BuscarArquivo 
{
    public List lerArq() 
    {
        String linha = "";
        try
        {
            File f = new File ("Objetos.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while(br.ready())
            {
                linha = br.readLine();
                verificaDados(br.readLine());
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public void verificaDados(String dados){
    
        if(dados.contains("CPF")){

            PessoaFisica pf = new PessoaFisica();

            int index = dados.indexOf(":");
            int tamanhoTotal = dados.length();
            String parteDados = dados.substring(index + 2, tamanhoTotal);
            System.out.println(parteDados);

        }
    }
    
}




/*public class BuscarArquivo 
{
    public String lerArq() throws FileNotFoundException
    {
        String linha = "";
        try
        {
            File f = new File ("Objetos.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while(br.ready())
            {
                linha = linha +"\n"+br.readLine();
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return linha;
    }
    
}*/
