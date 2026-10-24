package util;

public class Converte {
     
    public static final double TX = 0.06;
     
    public static double valorDolar(double dolar, double qtd){
        
        double valor = dolar * qtd;
        
        return valor + (valor * TX);
    }
    
}
