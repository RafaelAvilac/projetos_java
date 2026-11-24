package program.controle_estoque.objetos;

public class EntradaProduto {
    private int idEntrada;
    private int idProduto;
    private int quantidade;

    public EntradaProduto() {
    }
    

    public EntradaProduto(int idEntrada, int idProduto, int quantidade) {
        this.idEntrada = idEntrada;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }


    public int getIdEntrada() {
        return idEntrada; }
    
    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada; }

    public int getIdProduto() {
        return idProduto; }
    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto; }

    public int getQuantidade() {
        return quantidade; }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade; }
}




