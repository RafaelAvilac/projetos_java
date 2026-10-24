
package program.prj_polimorfismoherancasobre_poo1.models;

public class PessoaJuridica extends Pessoa {
    
    String cnpj;
    String inscricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    @Override
     public void cadastrar(){
        
        System.out.println("PessoaJuridica");
    
    
    }
    
    
}
