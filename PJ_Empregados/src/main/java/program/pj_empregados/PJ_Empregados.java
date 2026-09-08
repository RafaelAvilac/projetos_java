package program.pj_empregados;

import program.pj_empregados.service.EmpregadoService;

public class PJ_Empregados {

    public static void main(String[] args) {
        
        Empregado emp = new Empregado(10_000);
        
        Empregado ger = new Gerente(10_000, 30);
        
        System.out.printf("Proventos empregado: %,.2f%n", emp.getProventos());
        
        System.out.printf("Proventos gerente: %,.2f%n",ger.getProventos());
        
        System.out.printf("Bonus gerente: %,.2f%%\n",( (Gerente) ger).getBonus());
              
        
        EmpregadoService servico = new EmpregadoService();
        
        
        servico.concederAumento(emp, 10);
        servico.concederAumento(ger, 10);
        
        System.out.printf("Proventos empregado: %,.2f%n", emp.getProventos());
        
        System.out.printf("Proventos gerente: %,.2f%n",ger.getProventos());
        
        System.out.printf("Bonus gerente: %,.2f%%\n",( (Gerente) ger).getBonus());
        
        
    }
}
