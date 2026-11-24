package program.loca_car.modelos;

import java.sql.Date;

public class Locacao {
 
    private int idLocacao;
    private Date dataRetirada;
    private Date dataPrevistaDevolucao;
    private Date dataDevolucaoReal;
    private double valorDiariaAplicada; 
    private int idCliente;
    private int idVeiculo;

    
    public Locacao() {
    }

    
    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Date getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(Date dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public double getValorDiariaAplicada() {
        return valorDiariaAplicada;
    }

    public void setValorDiariaAplicada(double valorDiariaAplicada) {
        this.valorDiariaAplicada = valorDiariaAplicada;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
}