/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author rafae
 */
public class Triangulo {
    public double a, b, c;
    
    public double area( ){
        
        double p = (a + b + c) / 2.0;
        double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        
        return resultado;
    }
    
    public static void maior_area(double x, double y){
        
    if (x > y) {
            System.out.println("Larger area: X");
        } else if (y > x) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Both triangles have the same area.");
        }
    
    }
}
