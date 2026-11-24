package program.controle_estoque.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class ManipulaData {

    
    public static Date dataAtual() {
        return new Date(System.currentTimeMillis());
    }

   
    public static Date stringToDate(String dataString) {
        try {
           
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            java.util.Date dataUtil = formato.parse(dataString);
            return new Date(dataUtil.getTime());
            
        } catch (ParseException e) {
            System.out.println("Erro: Data invalida. Use o formato dd/MM/yyyy.");
            return null;
        }
    }

   
    public static String dateToString(Date data) {
        if (data == null) return "Data nao informada";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }
}
