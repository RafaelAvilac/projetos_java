/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.prj_rac_prova.models;

public class Rac_filme extends Rac_midia {
    
    private int duracaoMinutos;

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public Rac_filme(int duracaoMinutos, String titulo, double precoBase) {
        super(titulo, precoBase);
        this.duracaoMinutos = duracaoMinutos;
    }

  @Override
  public double calcularPrecoFinal(){
    
      if(duracaoMinutos > 120){
         precoBase += 5.0;
      }
      return precoBase;
  }
  
  @Override
  public String formatarDados(){
  
      return "FILME"+";" + "TituloDoFilme" + ";" + "PrecoFinal" + "Duracao";
  
  }

    
}
