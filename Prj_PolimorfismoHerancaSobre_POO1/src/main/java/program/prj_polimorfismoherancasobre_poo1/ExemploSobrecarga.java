
package program.prj_polimorfismoherancasobre_poo1;

public class ExemploSobrecarga {
    
    public ExemploSobrecarga(){
    
        System.out.println("Construtor sem parametros");
    
    }
    public ExemploSobrecarga(String a, String b){
    
        System.out.println("Construtor com parametros (a: "+a+", b: "+b+")");
    
    }
    
    public int somar(int nro1, int nro2){
    
        return nro1 + nro2;
        
    }
    
     public int somar(int nro1, int nro2, int nro3){
         
          return nro1 + nro2 + nro3;
     
     }
     public double somar(double nro1, double nro2){
     
          return nro1 + nro2;
         
     }
    public double somar(double nro1, int nro2){
     
          return nro1 + nro2;
         
     }
    public double somar(int nro1, double nro2){
     
          return nro1 + nro2;
         
     }
    
}
