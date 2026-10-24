
package program.app;

public class App {

    public static void main(String[] args) throws Exception{
       
        
        
        Celular celularA = new Celular();// Declaração do obj tipo Celular
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";
        
        System.out.format("Celular %s com tela de %.2f memoria  %d Gb e SO %s \n",
                celularA.nome,celularA.tamanhoTela,
                celularA.espacoArmazenamento,celularA.sistemaOperacional);
        
        
        Celular celularB = new Celular(); //obj celular B
        celularB.nome = "Galaxy note";
        celularB.tamanhoTela = 6.9;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "ANDROID";
        
        System.out.format("Celular %s com tela de %.2f memoria  %d Gb e SO %s \n",
                celularB.nome,celularB.tamanhoTela,
                celularB.espacoArmazenamento,celularB.sistemaOperacional);
        
        Celular celularC = new Celular(); //obj celular C
        celularC.nome = "Xiaomi A3";
        celularC.tamanhoTela = 6.5;
        celularC.espacoArmazenamento = 256;
        celularC.sistemaOperacional = "ANDROID";
        
        System.out.format("Celular %s com tela de %.2f memoria  %d Gb e SO %s ",
                celularC.nome,celularC.tamanhoTela,
                celularC.espacoArmazenamento,celularC.sistemaOperacional);
    }
}
