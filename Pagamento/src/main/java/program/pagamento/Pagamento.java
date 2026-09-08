package program.pagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import program.pagamento.models.Desenvolvedor;
import program.pagamento.models.Funcionario;
import program.pagamento.models.Gerente;

public class Pagamento {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        List<Funcionario> lista = new ArrayList<>();
        Funcionario fu = new Funcionario();
        Gerente ge = new Gerente();
        Desenvolvedor des = new Desenvolvedor();
        
        fu.setNome("Carlos");
        fu.setSalarioBase(1500);
        
        ge.setNome("Antonio");
        ge.setSalarioBase(3000);
        ge.setBonus(1500);
        
        des.setNome("Marcos");
        des.setSalarioBase(2200);
        des.setHorasExtras(8);
        des.setValorHoraExtra(5.69);
        
        lista.add(fu);
        lista.add(ge);
        lista.add(des);
        
        for (Funcionario f : lista) {
             
             System.out.printf("%s: R$ %.2f%n", f.getNome(), f.calcularSalario());
        } 
        
    }
}
