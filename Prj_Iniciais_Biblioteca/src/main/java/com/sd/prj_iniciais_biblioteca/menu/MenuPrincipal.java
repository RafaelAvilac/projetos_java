/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sd.prj_iniciais_biblioteca.menu;

import com.sd.prj_iniciais_biblioteca.bo.BibliotecaBO;

import com.sd.prj_iniciais_biblioteca.modelo.Rac_Emprestimo;
import com.sd.prj_iniciais_biblioteca.modelo.Rac_Livro;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaBO bo = new BibliotecaBO();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1 - Registrar Emprestimo");
            // TODO: Adicionar aqui a opção 2 - Excluir Empréstimo
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do Livro: ");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o Nome do Leitor: ");
                    String leitor = scanner.nextLine();

                    Rac_Livro livro = new Rac_Livro();
                    livro.setId(idLivro);

                    Rac_Emprestimo emp = new Rac_Emprestimo();
                    emp.setLivro(livro);
                    emp.setNomeLeitor(leitor);
                    emp.setStatus("ATIVO");

                    System.out.println(bo.salvarEmprestimo(emp));
                    break;

                // TODO: Implementar o case 2 para consultar e excluir o empréstimo

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}