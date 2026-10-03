/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.prj_rac_prova;

import program.prj_rac_prova.models.Rac_filme;
import program.prj_rac_prova.models.Rac_jogo;
import program.prj_rac_prova.models.Rac_midia;

/**
 *
 * @author rafae
 */
public class Prj_Rac_Prova {

    public static void main(String[] args) {
        Rac_gerenciadorArquivo ger = new Rac_gerenciadorArquivo();
        
        Rac_midia f1 = new Rac_filme(123, "xxx", 10.0);
        Rac_midia f2 = new Rac_jogo("Console", "PPP", 20.0);
        
        
       ger.salvarArquivo(f1);
       ger.salvarArquivo(f2);
       ger.lerArquivo();
        
    }
}
