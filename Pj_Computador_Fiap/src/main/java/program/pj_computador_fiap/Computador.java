package program.pj_computador_fiap;

public class Computador {
    
    private String modelo;
    private String marca;
    private int espacoHd;
    private int memoriaRam;
    boolean placaDeVideo;
    private String processador;
    private double preco;
    private Fabricante fabricante;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEspacoHd() {
        return espacoHd;
    }

    public void setEspacoHd(int espacoHd) {
        this.espacoHd = espacoHd;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public boolean isPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(boolean placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    public Computador(String vostro, String dell, int par, int par1, int par2, String amd, boolean par3, Fabricante fabricante1) {
        
    }
    
    public Computador(String modelo, String marca, int espacoHd, int memoriaRam, boolean placaDeVideo, String processador, double preco, Fabricante fabricante) {
        this.modelo = modelo;
        this.marca = marca;
        this.espacoHd = espacoHd;
        this.memoriaRam = memoriaRam;
        this.placaDeVideo = placaDeVideo;
        this.processador = processador;
        this.preco = preco;
        this.fabricante = fabricante;
    }
    
    public double calcularDesconto(double desconto){
        return preco * desconto;
    }
    
    boolean adicionarMemoriaRam(int quantidade){
        if(quantidade %2==1)return false;
        
        memoriaRam += quantidade;
        preco += quantidade * 150;
        return true;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Computador{" + "modelo=" 
                + modelo 
                + ",\n marca="
                + marca + ",\n espacoHd=" 
                + espacoHd 
                + ",\n memoriaRam=" 
                + memoriaRam 
                + ",\n placaDeVideo=" 
                + placaDeVideo 
                + ",\n processador=" 
                + processador 
                + ",\n preco=" 
                + preco 
                + ",\n fabricante=" 
                + fabricante + '}';
    } 
    
}
