package program.gestaofrota;

import java.io.BufferedReader; // Lê texto de forma eficiente mantendo em buffer 📖
import java.io.FileReader;     // Abre o arquivo de texto para leitura 📂
import java.io.FileWriter;     // Abre ou cria o arquivo para escrita ✍️
import java.io.IOException;    // Trata exceções de entrada e saída de dados 🛡️
import java.io.PrintWriter;    // Escreve dados formatados (como println) no arquivo 🖨️
import program.gestaofrota.models.Veiculo; // Importa a superclasse polimórfica 🚗

public class GerenciadorFrota {

    // 1. Salva veículos no arquivo (Polimorfismo em ação 🎭)
    public void salvarVeiculo(Veiculo v) {
        // O try-with-resources garante que os arquivos serão fechados automaticamente 🚪
        // 'true' no FileWriter ativa o modo de escrita contínua (append), sem apagar o arquivo
        try (FileWriter fw = new FileWriter("frota.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {

            // Chama o gerarLinhaArquivo() sobrescrito da subclasse real (Moto ou Caminhao)
            pw.println(v.gerarLinhaArquivo());
            System.out.println("Veículo salvo com sucesso!");
        } catch (IOException e) {
            // Captura falhas de permissão ou falta do arquivo no disco 🛑
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    // 2. Lista todos os veículos registrados 📜
    public void listarVeiculos() {
        // FileReader abre o arquivo e o BufferedReader lê linha por linha
        try (FileReader fr = new FileReader("frota.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            // br.readLine() retorna 'null' quando não há mais linhas a serem lidas 🔚
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    // 3. Busca por placa (Sobrecarga 1 - parâmetro String 🔍)
    public void buscarVeiculo(String placa) {
        try (BufferedReader br = new BufferedReader(new FileReader("frota.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // 'contains' verifica se a sequência de caracteres da placa existe no texto da linha 🎯
                if (linha.contains(placa)) {
                    System.out.println("Veículo encontrado: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
        }
    }

    // 4. Busca por valor máximo de locação (Sobrecarga 2 - parâmetro double 🔢)
    public void buscarVeiculo(double valorMaximo) {
        try (BufferedReader br = new BufferedReader(new FileReader("frota.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Divisão do texto formatado usando o delimitador ponto e vírgula ✂️
                String[] dados = linha.split(";");

                // Validação de segurança para garantir a existência do índice de valor 🛡️
                if (dados.length >= 4) {
                    // Double.parseDouble converte o texto da posição 3 em valor numérico decimal 🔣
                    double valor = Double.parseDouble(dados[3].trim());
                    if (valor <= valorMaximo) {
                        System.out.println("Opção dentro do valor: " + linha);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
        }
    }
}