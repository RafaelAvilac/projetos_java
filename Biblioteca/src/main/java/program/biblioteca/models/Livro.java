
package program.biblioteca.models;


public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPubilcacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPubilcacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubilcacao = anoPubilcacao;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPubilcacao() {
        return anoPubilcacao;
    }

    public void setAnoPubilcacao(int anoPubilcacao) {
        this.anoPubilcacao = anoPubilcacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void emprestar(){
        
        if(disponivel){
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        }else{
            System.out.println("Livro indisponivel");
        
        }
    
    }
    
    public void devolver(){
        
         if (!disponivel) {
             disponivel = true;
             System.out.println("Livro devolvido com sucesso!");
        } else {
             System.out.println("Este livro já está disponível!");
        }
    }     
       
    public void exibirInformacoes(){
        System.out.print("=== LIVROS CADASTRADOS ===\n");
        System.out.printf("Titulo: %s\nAutor: %s\nAno: Publicado: %d\nDisponivel: %b\n\n",
                           titulo, autor, anoPubilcacao, disponivel);
        System.out.println("------------------------\n");
    }
    
}
