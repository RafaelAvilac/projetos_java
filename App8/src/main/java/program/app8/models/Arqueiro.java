/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.app8.models;

/**
 *
 * @author rafae
 */
public final class Arqueiro extends Personagem {
    private String arma;
    
    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco longo";
    }
    
    @Override
    public String toString() {
        
        String informacoes = super.toString() + " - Arma: " + arma;
                                            
        return informacoes;
    }
    
    @Override
    public void atacar(){
        System.out.printf("O arqueiro atacaou com %s!\n", arma);
    }
    
}
