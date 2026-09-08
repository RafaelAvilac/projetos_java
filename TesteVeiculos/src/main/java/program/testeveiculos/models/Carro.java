
package program.testeveiculos.models;

public class Carro extends Veiculo {
    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    
    
    @Override
     public String descrever(){
    
         return "Carro: " + getModelo() + " - " + numeroPortas +  " portas";
      
    }
}
