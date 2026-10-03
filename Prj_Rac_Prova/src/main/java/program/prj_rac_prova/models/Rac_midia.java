/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.prj_rac_prova.models;


public abstract class Rac_midia implements Rac_exportavel {
    private String titulo;
    double precoBase;

    public Rac_midia(String titulo, double precoBase) {
        this.titulo = titulo;
        this.precoBase = precoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
  
    abstract public double calcularPrecoFinal();
}
