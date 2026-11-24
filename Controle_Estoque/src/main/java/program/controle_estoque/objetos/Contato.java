package program.controle_estoque.objetos;

public class Contato {
    private int idContato;
    private String tipoContato;
    private String contato;
    private int idFornecedor;

    public Contato() {
    }

    public Contato(String tipoContato, String contato, int idFornecedor) {
        this.tipoContato = tipoContato;
        this.contato = contato;
        this.idFornecedor = idFornecedor;
    }


    public int getIdContato() {
        return idContato; }
    
    public void setIdContato(int idContato) { 
        this.idContato = idContato; }

    public String getTipoContato() {
        return tipoContato; }
    
    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato; }

    public String getContato() { 
        return contato; }
    
    public void setContato(String contato) { 
        this.contato = contato; }

    public int getIdFornecedor() {
        return idFornecedor; }
    
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor; }
}
