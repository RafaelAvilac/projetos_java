
package classes;

public class Personagem {
    
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        forca = 30;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void mostraStatus(){
        
        System.out.printf("Nome: %s\nNivel: %d\nClasse: %s\nForca: %d",
                          nome, nivel, classe, forca);
    }
    
    
}
