/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.gestaofrota;

import program.gestaofrota.models.Caminhao;
import program.gestaofrota.models.Moto;

public class GestaoFrota {
    public static void main(String[] args) {
        // 🛠️ Instancia a classe responsável por gerenciar a leitura e escrita de arquivos
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        // 🚚 Instancia os objetos das subclasses Caminhao e Moto
        Caminhao caminhao = new Caminhao(10000.0, "Volvo", "ABC1D23", 500.0);
        Moto moto = new Moto(160, "Honda", "XYZ9876", 120.0);

        System.out.println("--- 1. SALVANDO VEÍCULOS ---");
        // 🎭 Polimorfismo: o mesmo método 'salvarVeiculo' aceita objetos de subclasses diferentes
        gerenciador.salvarVeiculo(caminhao);
        gerenciador.salvarVeiculo(moto);

        System.out.println("\n--- 2. LISTAGEM COMPLETA DA FROTA ---");
        // 📜 Lê e exibe todas as linhas salvas no arquivo 'frota.txt'
        gerenciador.listarVeiculos();

        System.out.println("\n--- 3. TESTE DE BUSCA POR PLACA ---");
        // 🔍 Sobrecarga: o Java chama o método que recebe uma String (placa)
        gerenciador.buscarVeiculo("ABC1D23");

        System.out.println("\n--- 4. TESTE DE BUSCA POR VALOR MÁXIMO ---");
        // 🔢 Sobrecarga: o Java chama o método que recebe um double (valor maximo)
        gerenciador.buscarVeiculo(200.0);
    }
}