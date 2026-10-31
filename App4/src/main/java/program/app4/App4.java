
package program.app4;

import program.app4.models.Circulo;
import program.app4.models.Quadrado;
import program.app4.models.SomarArea;

public class App4 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(5);
        
        SomarArea calc = new SomarArea();
        
        System.out.println(calc.somar(quadrado, circulo));
        
    }
}
