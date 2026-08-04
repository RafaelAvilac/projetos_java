
package program.prj_calculadoraeqseggrau_poo1;

public class Prj_CalculadoraEqSegGrau_POO1 {

    public static void main(String[] args) {
       double a = 1;
       double b = 5;
       double c = 6;
       
       double delta = (b * b) - 4 * a * c;
       
       double x1L =( - b + Math.sqrt(delta)) / (2 * a);
       double x2L =( - b - Math.sqrt(delta)) / (2 * a);
       
        System.out.println("O valore de delta eh: " + delta);
        System.out.println("O valor de x': " + x1L);
        System.out.println("O valor de x'': "+ x2L);
       
    }
}
