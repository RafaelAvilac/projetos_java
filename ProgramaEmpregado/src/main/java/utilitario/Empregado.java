
package utilitario;

public class Empregado {
    public String nome;
    public double salario;
    public double imposto;
    
    
    public double salarioAtual(){
    
        return salario - imposto;
        
    }
    
    
    public void Aumento(double percentual){
    
        salario += salario * percentual/100;
   
    }
    @Override
    public String toString(){
    
        return nome 
                +", R$ "
                +String.format("%.2f", salarioAtual());
    } 
}
