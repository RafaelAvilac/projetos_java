package program.pj_computador_fiap;

public class Cep  implements Validavel<String> {

    String numero;
    
    
    @Override
    public boolean validar(String s) {
       
        return s.matches("[0-9]{5}-[0-9]{3}");
    }

    @Override
    public String toString() {
        return  numero;
    }
    
    
    
    
}
