
package program.prj_fiap_produtos.models;

import java.util.Objects;

class Categoria {
    
    Long id;
    String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        return Objects.equals(this.nome, other.nome);
    }

    
    
    
    
    @Override
    public String toString() {
        return nome.toUpperCase();
    }   
    
}
  