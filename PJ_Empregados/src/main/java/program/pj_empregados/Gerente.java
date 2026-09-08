
package program.pj_empregados;


public class Gerente extends Empregado {
    
    private double bonus;

    public double getProventos(){
    
        return super.getSalario() * (1 + (bonus / 100));
    
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    

    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente{");
        sb.append("bonus=").append(bonus);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}
