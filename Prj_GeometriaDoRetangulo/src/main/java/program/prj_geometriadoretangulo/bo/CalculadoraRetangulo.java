package program.prj_geometriadoretangulo.bo;

import program.prj_geometriadoretangulo.models.Entrada;
import program.prj_geometriadoretangulo.models.Saida;

public class CalculadoraRetangulo {
    
   private Entrada dados;
   
    public CalculadoraRetangulo(Entrada dados) {
        this.dados = dados;
    }
    
    public Saida calcular() {
        Saida saida = new Saida();
        
       
        double area = dados.getBase() * dados.getAltura();
        double perimetro = 2 * (dados.getBase() + dados.getAltura());
        
        saida.setArea(area);
        saida.setPerimetro(perimetro);
        
        return saida;
    }
    
}
