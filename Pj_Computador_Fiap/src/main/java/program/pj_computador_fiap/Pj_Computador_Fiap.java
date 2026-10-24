
package program.pj_computador_fiap;

public class Pj_Computador_Fiap {

   public static void main(String[] args){
    
       Computador pc = new Computador("vostro", "Dell", 500, 16, 1000, "AMD", true, new Fabricante("Dell Company", "Av. Paulista"));
       
       pc.setModelo("Dl65");
       pc.setMarca("Dell");
       pc.setEspacoHd(256);  
       pc.setMemoriaRam(8);
       pc.setPlacaDeVideo(true);
       pc.setProcessador("i7");
       pc.setPreco(5200.00f);
       
       Fabricante dell = new Fabricante();
       dell.nome = "Dell Company";
       dell.endereco = "Av. Paulista 1000";
       
       pc.setFabricante(dell);
       
      double valorComDesconto = pc.calcularDesconto(0.1);
      System.out.printf("Valor com desconto: %.2f%n", valorComDesconto);
      
      boolean sucesso = pc.adicionarMemoriaRam(6);
      
        if (sucesso) {
          System.out.println("Memória Ram adicionada");
          System.out.println("Quantidade de memória Ram: " + pc.getMemoriaRam());
          System.out.printf("Novo valor do computador: %.2f%n", pc.getPreco());
        } else {
          System.out.println("Não foi possível adicionar a memória");
        }

    }
   
}
