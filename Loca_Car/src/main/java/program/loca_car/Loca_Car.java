
package program.loca_car;

import program.loca_car.conexao.Conexao;

public class Loca_Car {

    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        
           conexao.conectar();
           System.out.println("Conectado com sucesso ao banco loca_car!");
    }    
}
