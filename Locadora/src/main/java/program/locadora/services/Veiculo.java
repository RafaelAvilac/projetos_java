package program.locadora.services;



public class Veiculo {
    
    private static final double KM_LIMITE = 50000;
    private static final double DIARIA_ATE_LIMITE = 150;
    private static final double DIARIA_ACIMA_LIMITE = 100;
    
    private final String placa;
    private String modelo;
    private double quilometragemAtual;

    public Veiculo(String placa, String modelo, double km) {
        this.placa = placa;
        this.modelo = modelo;
        registrarViagem(km);
    }
     public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        
    }
   
    public String getPlaca(){
        return placa;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getQuilometragemAtual() {
        return quilometragemAtual;
    }
    
    public void registrarViagem(double km){
        
        quilometragemAtual += km;
    
    }
    public double valorDiaria( ){
        
        if(quilometragemAtual < KM_LIMITE){
            
            return DIARIA_ATE_LIMITE;
        
        }else{
                
            return DIARIA_ACIMA_LIMITE;
        
        }
    
    }
    
     public double calcularAluguel(int dias){
            
            return valorDiaria() * dias;
   
    }

    @Override
    public String toString() {
        return "Veiculo Locado. " + 
               "\nPlaca: " + placa +
               "\nModelo: " + modelo + 
               "\nQuilometragem: " + String.format("%,.2f", quilometragemAtual )+ 
               "\nValor da diaria: " + String.format("%,.2f", valorDiaria());
    }
     
     
    
}
