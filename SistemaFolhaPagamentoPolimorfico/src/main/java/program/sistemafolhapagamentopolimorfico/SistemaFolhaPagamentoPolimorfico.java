package program.sistemafolhapagamentopolimorfico;

import java.util.ArrayList;
import program.sistemafolhapagamentopolimorfico.modelo.Desenvolvedor;
import program.sistemafolhapagamentopolimorfico.modelo.Funcionario;
import program.sistemafolhapagamentopolimorfico.modelo.Gerente;

public class SistemaFolhaPagamentoPolimorfico {
    
    public static void main(String[] args) {
        // Instanciando os objetos
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        
        // Preenchendo dados do Funcionario
        funcionario.setNome("João Silva");
        funcionario.setSalarioBase(3000.00);
        
        // Preenchendo dados do Gerente
        gerente.setNome("Maria Santos");
        gerente.setSalarioBase(5000.00);
        gerente.setBonus(1500.00);
        
        // Preenchendo dados do Desenvolvedor
        desenvolvedor.setNome("Pedro Oliveira");
        desenvolvedor.setSalarioBase(4000.00);
        desenvolvedor.setHorasExtras(10);
        desenvolvedor.setValorHoraExtra(50.00);
        
        // Criando ArrayList genérico de Funcionario
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario);
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);
        
        // Percorrendo a lista e imprimindo os dados
        System.out.println("=== DADOS DOS FUNCIONÁRIOS ===\n");
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário Final: R$ " + String.format("%.2f", f.calcularSalario()));
            System.out.println("-----------------------------");
        }
    }
}
