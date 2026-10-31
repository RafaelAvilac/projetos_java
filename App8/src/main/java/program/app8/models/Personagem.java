
package program.app8.models;

import java.util.Locale;


public class Personagem {
    
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public final void atacarSemArma(){
        System.out.println("O personagem atacou!\n");
    }
    public void atacar(){
        System.out.println("O persongem atacou\n");
    }

    @Override
    public String toString() {
        
        String informacoes = String.format("%s (nivel: %d) - classe: %s", nome, nivel, classe);
        return informacoes;
    }
    
    
}
