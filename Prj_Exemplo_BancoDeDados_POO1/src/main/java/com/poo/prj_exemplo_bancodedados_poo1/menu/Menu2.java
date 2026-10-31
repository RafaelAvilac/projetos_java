/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_exemplo_bancodedados_poo1.menu;

import com.poo.prj_exemplo_bancodedados_poo1.bo.PessoaBO;
import com.poo.prj_exemplo_bancodedados_poo1.models.Pessoa;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Iftm
 */
public class Menu2 {
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        PessoaBO pessoaBO = new PessoaBO();
        int opcao = 0;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Cadastrar nova Pessoa");
            System.out.println("2. Consultar Pessoas");
            System.out.println("3. Excluir Pessoa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0; 
            }

            switch (opcao) {
                case 1:
                    Pessoa p = new Pessoa();
                    
                    System.out.print("Digite o nome: ");
                    p.setNome(scanner.nextLine());
                    
                    System.out.print("Digite o CPF: ");
                    p.setCpf(scanner.nextLine());
                    
                    System.out.print("Digite a idade: ");
                    try {
                        p.setIdade(Integer.parseInt(scanner.nextLine()));
                        
                        Pessoa pessoaSalva = pessoaBO.salvar(p);
                        
                        if (pessoaSalva.getId_pessoa() != -1) {
                            System.out.println("Sucesso! Pessoa salva com o ID: " + pessoaSalva.getId_pessoa());
                        } else {
                            System.out.println("Falha ao salvar a pessoa no banco de dados.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: A idade deve ser um número inteiro.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PESSOAS ---");
                    List<Pessoa> lista = pessoaBO.getPessoas();
                    
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum registro encontrado no banco de dados.");
                    } else {
                        for (Pessoa pessoa : lista) {
                            pessoaBO.mostrarDados(pessoa);
                        }
                    }
                    break;
                    
                case 3:
                    Pessoa p2 = new Pessoa();
                    System.out.print("Digite o ID: ");
                    p2.setId_pessoa(Integer.parseInt(scanner.nextLine()));
                    pessoaBO.excluir(p2);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
