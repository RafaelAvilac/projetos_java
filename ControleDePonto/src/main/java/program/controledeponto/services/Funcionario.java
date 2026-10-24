
package program.controledeponto.services;

public class Funcionario {

    private static final double LIMITE_HORA = 40;
    private static final double VL_H_LIMT = 25.00;
    private static final double VL_H_ACIMA_LIMIT = 30.00;

    private final String matricula;
    private String nome;
    private double saldoHoras;

    public Funcionario(String matricula, String nome, double horas) {
        this.matricula = matricula;
        this.nome = nome;
        adicionarHora(horas);
    }

    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public double getSaldoHoras() {
        return saldoHoras;
    }

    public void  adicionarHora(double horas){

           saldoHoras += horas;

    }

    public boolean reduzirHoras(double horas){

        if(horas > 0 && horas <= saldoHoras){
            saldoHoras -= horas;
            return true;
        }
        return false;
    }

    public double valorDevido( ){

        if(saldoHoras <= LIMITE_HORA  ){
            return saldoHoras * VL_H_LIMT;
        }else{
            return saldoHoras * VL_H_ACIMA_LIMIT;
        }

    }

    @Override
    public String toString() {
        return "\n--- Funcionario ---" +
               "\nMatricula: " + matricula +
               "\nNome: " + nome +
               "\nSaldoHoras: " + String.format("%.2f",saldoHoras )+
               "\nValor pago: "+ String.format("%.2f",valorDevido());
    }

}
