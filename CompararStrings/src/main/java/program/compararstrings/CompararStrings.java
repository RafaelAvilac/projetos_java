package program.compararstrings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompararStrings {

    public static void main(String[] args) {
       
        String escola1 = "Iftm";
        String escola2 = new String("Iftm");
        
        LocalDateTime agora = LocalDateTime.now();
        
        boolean isEqual = (escola1.equals(escola2));
        
        
        System.out.println(isEqual); 
        System.out.println("Hoje: " 
                + LocalDate.now()
                  .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Horas: " +  agora);
        
    }
}
