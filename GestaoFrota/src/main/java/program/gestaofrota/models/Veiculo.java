/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.gestaofrota.models;

/**
 *
 * @author rafae
 */
public class Veiculo implements Exportavel{
    private String marca;
    private String placa; 
    private double valorLocado;

    public Veiculo(String marca, String placa, double valorLocado) {
        this.marca = marca;
        this.placa = placa;
        this.valorLocado = valorLocado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorLocado() {
        return valorLocado;
    }

    public void setValorLocado(double valorLocado) {
        this.valorLocado = valorLocado;
    }
    
    @Override
    public String gerarLinhaArquivo(){
    
        return marca + "; " + placa + "; " + valorLocado;
    
    }
}
