package program.prj_fiap_produtos.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {
    
    long id;
    String nome;
    String descricao;
    BigDecimal preco;
    LocalDateTime dataDeCadastro;
    Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dataDeCadastro = dataDeCadastro;
        this.categoria = categoria;
    }

    public Produto(long id, String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dataDeCadastro = dataDeCadastro;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  nome.toUpperCase();
    }
    
    
}
