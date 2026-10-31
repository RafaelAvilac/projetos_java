
package program.app4.models;


public class SomarArea{
    
    public double somar(FiguraGeometrica quadrado, FiguraGeometrica circulo ){
        
        double totalArea = quadrado.calcularArea() + circulo.calcularArea();
        return totalArea;
    
    }

  
}
