package program.prj_exemploclasseabstrata;

import program.prj_exemploclasseabstrata.models.Circulo;
import program.prj_exemploclasseabstrata.models.FomaGeometrica;
import program.prj_exemploclasseabstrata.models.Retangulo;

public class Prj_ExemploClasseAbstrata {

    public static void main(String[] args) {
        
        FomaGeometrica r = new Retangulo("Retangulo Azul", 10, 5);
        FomaGeometrica c = new Circulo("Circulo Verde", 7);
        
        System.out.println("Nome da forma: " + r.getNome());
        System.out.println("Area: " + r.calcularArea());
        
        System.out.println("---");
        
        System.out.println("Nome da forma: "+ c.getNome());
        System.out.println("Area: " + c.calcularArea());;
        
        
    }
}
