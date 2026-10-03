/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.prj_rac_prova.models;


public class Rac_jogo extends Rac_midia {
    
    private String plataforma;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Rac_jogo(String plataforma, String titulo, double precoBase) {
        super(titulo, precoBase);
        this.plataforma = plataforma;
    }
    @Override
  public double calcularPrecoFinal(){
    
      if(plataforma.equals("Console")){
        precoBase = precoBase + precoBase * 0.15;
      }
      return precoBase;
  }

   
    @Override
  public String formatarDados(){
  
      return "JOGO"+";" + "TituloDoJogo" + ";" + "PrecoFinal" + "Plataforma";
  }
  public void aplicarDesconto(double porcentagem){
  
      precoBase = precoBase - precoBase *porcentagem;
  
  }
  public void aplicarDesconto(double porcentagem, boolean ehLancamento){
      
      if(ehLancamento == false){
          precoBase = precoBase - precoBase * porcentagem;
      }else{
          System.out.println("Lancamento não recebem desconto");
      
      }
  
  }
  
}
