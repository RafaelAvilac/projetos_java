
package program.biblioteca;

import program.biblioteca.models.Livro;

public class Biblioteca {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O lago", "Jose Carlos", 1956);
        Livro livro2 = new Livro("Metanoia","Livia Nunes",1999);
        Livro livro3 = new Livro("Noite Negra", "Paulo Robert", 2002);
        
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
        
        livro1.emprestar();
        livro1.emprestar();
        
        livro1.devolver();
        
        livro2.emprestar();
        
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
        
    }
}
