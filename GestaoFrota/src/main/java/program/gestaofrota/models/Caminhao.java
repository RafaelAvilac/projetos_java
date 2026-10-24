
package program.gestaofrota.models;

public class Caminhao extends Veiculo{
    
   private double capacidadeCarga;

    public Caminhao(double valorLocado, String marca, String placa, double capacidadeCarga) {
        super(marca, placa, valorLocado);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
            
    public String gerarLinhaArquivo(){
        
     return "Caminhao;" + super.gerarLinhaArquivo() + "; " + capacidadeCarga;
    }
}
