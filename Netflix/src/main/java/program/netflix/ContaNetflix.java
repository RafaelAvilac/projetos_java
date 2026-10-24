
package program.netflix;

public class ContaNetflix {
    
    
    private String idiomaPreferencial;
    private String resolucaoTela;
    
    public void entrar(){
        
        buscarPreferenciaDoUsuario();
        resolucaoTela();
        
    }
    void buscarPreferenciaDoUsuario(){
        
        idiomaPreferencial = "PT-BR";
        
    }
    private void resolucaoTela(){
    
        resolucaoTela = "FULL HD";
    
    }
    
    public void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o Filme: " + nomeFilme);
        System.out.println("Carregando o filme na resolucao: " + resolucaoTela);
        
        carregandoAudioFilme();
    }
    
    private void carregandoAudioFilme(){
        
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
        
            System.out.println("Carregando o audio em: "+ idiomaPreferencial);
        
        }else{
            System.out.println("Carregando o audio em EN-US");
        
        }
    }
    
    
}
