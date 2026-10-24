
package program.festa;


public class FestaVip {
   
    private int quantidadeCafe = 30;
    private int quantidadeSalgados = 50;
    
    public void entrar(){
        beberCafe();
        comerSalgado();
    
    }
    
    // modificador de acesso
    private void beberCafe(){
        quantidadeCafe--;
        System.out.println("Bebeu 1 xicara de cafe");
    }
    
    private void comerSalgado(){
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    
    }
}
