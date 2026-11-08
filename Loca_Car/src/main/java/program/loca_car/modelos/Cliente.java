
package program.loca_car.modelos;


public class Cliente {
    
    private int idCliente;
    private String nome;
    private String cnh;
    private String tipoCnh;

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String cnh, String tipoCnh) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cnh = cnh;
        this.tipoCnh = tipoCnh;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTipoCnh() {
        return tipoCnh;
    }

    public void setTipoCnh(String tipoCnh) {
        this.tipoCnh = tipoCnh;
    }
   
}
