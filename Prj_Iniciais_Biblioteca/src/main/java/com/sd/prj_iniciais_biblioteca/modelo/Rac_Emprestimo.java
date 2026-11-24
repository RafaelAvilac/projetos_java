
package com.sd.prj_iniciais_biblioteca.modelo;


public class Rac_Emprestimo {
    private int id;
    private String livro;
    private String nome_leitor;
    private String status;

    public Rac_Emprestimo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getNome_leitor() {
        return nome_leitor;
    }

    public void setNome_leitor(String nome_leitor) {
        this.nome_leitor = nome_leitor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
