
package program.controle_estoque.objetos;

import java.sql.Date;

public class Entrada {
     private int idEntrada;
    private Date dataEntrada;
    private double totalEntrada;
    private int idFornecedor;

    public Entrada() {
    }
    public Entrada(Date dataEntrada, double totalEntrada, int idFornecedor) {
        this.dataEntrada = dataEntrada;
        this.totalEntrada = totalEntrada;
        this.idFornecedor = idFornecedor;
    }

    public int getIdEntrada() {
        return idEntrada; }
    
    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada; }
    
    public Date getDataEntrada() {
        return dataEntrada; }
    
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada; }
    
    public double getTotalEntrada() {
        return totalEntrada; }
    
    public void setTotalEntrada(double totalEntrada) { 
        this.totalEntrada = totalEntrada; }
    
    public int getIdFornecedor() {
        return idFornecedor; }
    
    public void setIdFornecedor(int idFornecedor) { 
        this.idFornecedor = idFornecedor; }
}
