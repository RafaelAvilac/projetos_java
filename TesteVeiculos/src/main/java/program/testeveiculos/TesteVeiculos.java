package program.testeveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import program.testeveiculos.models.Carro;
import program.testeveiculos.models.Moto;
import program.testeveiculos.models.Veiculo;

public class TesteVeiculos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        List<Veiculo> lista = new ArrayList<>();
        
       
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        carro.setModelo("Corsa");
        carro.setNumeroPortas(4);
        carro.setVelocidadeMaxima(180);
        
        moto.setModelo("Hornet");
        moto.setCilindrada(600);
        moto.setVelocidadeMaxima(250);
        
        lista.add(carro);
        lista.add(moto);
        
        for(Veiculo v : lista){
           System.out.printf("%s | Tempo: %.2f horas%n", v.descrever(), v.calcularTempoViagem(500));
        }
        
    }
}
