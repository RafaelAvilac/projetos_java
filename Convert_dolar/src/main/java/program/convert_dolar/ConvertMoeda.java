
package program.convert_dolar;



public class ConvertMoeda {
    
    private static final double TAXA_IOF = 0.06;
    
    public static double converter(double qtd, double valor){
    
           double totalDollar = valor / qtd;
           double valorFinal = totalDollar * (1 - TAXA_IOF );
           return valorFinal;
    
    }
    
}
