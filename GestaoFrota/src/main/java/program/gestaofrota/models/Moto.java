
package program.gestaofrota.models;

public class Moto extends Veiculo {
   
    private int cilindrada;

    public Moto(int cilindrada, String marca, String placa, double valorLocado) {
        super(marca, placa, valorLocado);
        this.cilindrada = cilindrada;
    }

    @Override
    
     public String gerarLinhaArquivo(){
    
        return "Moto;" + super.gerarLinhaArquivo() +"; "+ cilindrada;
    
    }
}
