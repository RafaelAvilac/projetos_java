
package com.poo.prj_polimorfismoherancasobre_poo1;

import com.poo.prj_polimorfismoherancasobre_poo1.models.Pessoa;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class GravarArquivo {
    
    public void escreverArq(Pessoa p)
    {
        File f = new File("Objetos.txt");
        try
        {
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(p.cadastrar());
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
