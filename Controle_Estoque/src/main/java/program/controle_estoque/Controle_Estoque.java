

package program.controle_estoque;

import java.sql.Date;
import java.util.Scanner;
import program.controle_estoque.objetos.Contato;
import program.controle_estoque.objetos.Entrada;
import program.controle_estoque.objetos.EntradaProduto;
import program.controle_estoque.objetos.Fornecedor;
import program.controle_estoque.objetos.Produto;
import program.controle_estoque.rn.Contato_RN;
import program.controle_estoque.rn.Fornecedor_RN;
import program.controle_estoque.rn.Produto_RN;
import program.controle_estoque.util.ManipulaData;


public class Controle_Estoque {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========= MENU PRINCIPAL =========");
            System.out.println("1 - Fornecedor e Contato");
            System.out.println("2 - Produto");
            System.out.println("3 - Entrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    menuFornecedorContato();
                    break;
                case 2:
                    menuProduto();
                    break;
                case 3:
                    menuEntrada();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ==========================================
    // SUBMENU: FORNECEDOR E CONTATO
    // ==========================================
    private static void menuFornecedorContato() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU FORNECEDOR/CONTATO ===");
            System.out.println("1 - Cadastrar Fornecedor");
            System.out.println("2 - Listar Fornecedores");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = sc.nextLine();
                    
                    Fornecedor f = new Fornecedor(nome, cnpj);
                    new Fornecedor_RN().cadastrar(f); // Chama a Regra de Negócio

                    System.out.print("Quantos contatos deseja adicionar? ");
                    int qtdContatos = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= qtdContatos; i++) {
                        System.out.println("--- Contato " + i + " ---");
                        System.out.print("Tipo (Ex: Comercial): ");
                        String tipo = sc.nextLine();
                        System.out.print("Contato (Telefone/Email): ");
                        String valorContato = sc.nextLine();
                        
                        // Usa o ID gerado no objeto 'f' pelo DAO
                        Contato c = new Contato(tipo, valorContato, f.getIdFornecedor());
                        new Contato_RN().cadastrar(c);
                    }
                    break;
                case 2:
                    new Fornecedor_RN().listar();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ==========================================
    // SUBMENU: PRODUTO
    // ==========================================
    private static void menuProduto() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU PRODUTO ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    
                    Produto p = new Produto(nome, valor);
                    new Produto_RN().cadastrar(p);
                    break;
                case 2:
                    // Supondo que você criou o listar na Produto_RN
                    for (Produto prod : new program.controle_estoque.dao.ProdutoDAO().listar()) {
                        System.out.println("ID: " + prod.getIdProduto() + " | Nome: " + prod.getNome() + " | R$ " + prod.getValor());
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // ==========================================
    // SUBMENU: ENTRADA (A parte complexa)
    // ==========================================
    private static void menuEntrada() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU ENTRADA ===");
            System.out.println("1 - Registrar Entrada");
            System.out.println("2 - Listar Entradas");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID do fornecedor: ");
                    int idFornecedor = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Data da Entrada (dd/MM/yyyy): ");
                    String dataStr = sc.nextLine();
                    Date dataEntrada = ManipulaData.stringToDate(dataStr);

                    System.out.print("Quantos produtos na entrada? ");
                    int qtdProdutos = sc.nextInt();
                    sc.nextLine();

                    double totalEntrada = 0;
                    java.util.List<EntradaProduto> itensNota = new java.util.ArrayList<>();

                    for (int i = 1; i <= qtdProdutos; i++) {
                        System.out.println("--- Produto " + i + " ---");
                        System.out.print("ID do Produto: ");
                        int idProd = sc.nextInt();
                        System.out.print("Quantidade: ");
                        int qtd = sc.nextInt();
                        sc.nextLine();

                        // Adiciona na lista temporária (idEntrada será preenchido depois)
                        itensNota.add(new EntradaProduto(0, idProd, qtd));
                    }

                    System.out.print("Valor Total da Nota: ");
                    totalEntrada = sc.nextDouble();

                    // 1. Salva a Entrada (Cabeçalho)
                    Entrada novaEntrada = new Entrada(dataEntrada, totalEntrada, idFornecedor);
                    int idEntradaGerado = new program.controle_estoque.dao.EntradaDAO().inserir(novaEntrada);

                    // 2. Salva os itens vinculados
                    if (idEntradaGerado > 0) {
                        for (EntradaProduto item : itensNota) {
                            item.setIdEntrada(idEntradaGerado);
                            new program.controle_estoque.dao.EntradaProdutoDAO().inserir(item);
                        }
                        System.out.println("✅ Entrada registrada com sucesso!");
                    }
                    break;

                case 2:
                    // Listagem simples de entradas
                    for (Entrada e : new program.controle_estoque.dao.EntradaDAO().listar()) {
                        System.out.println("ID: " + e.getIdEntrada() + " | Data: " + ManipulaData.dateToString(e.getDataEntrada()) + " | Total: R$ " + e.getTotalEntrada() + " | ID Fornecedor: " + e.getIdFornecedor());
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
