package program.mediaponderada.services;

import program.mediaponderada.models.DadosEntradaNotas;
import program.mediaponderada.models.DadosSaidaNotas;

public class CalculadoraNotas {
    
    private DadosSaidaNotas ds = new DadosSaidaNotas();
    
    public DadosSaidaNotas calcularMedia(DadosEntradaNotas de){
        
        double media = (de.getNota1() * de.getPeso1()
                     + de.getNota2() * de.getPeso2()
                     + de.getNota3() * de.getPeso3())
                     / (de.getPeso1() + de.getPeso2() + de.getPeso3());
        
        ds.setMedia(media);
        return ds;
    }
    public DadosSaidaNotas definirSituacao(DadosEntradaNotas de){
    
            String situacao;
        
            if(ds.getMedia() >= 7){
                
                situacao = "Aprovado";
                
            }else{
                situacao = "Reprovado";
                 
            }
            ds.setSituacao(situacao);
            
            return ds;
    
    }
    
}
