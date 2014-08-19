package br.com.marquimrock.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUIL = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "IdEstado", nullable = false)
    private Integer IdEstado;
    @Column(name = "Nome", length = 80, nullable = false)
    private String nome;
    
    @OneToMany(mappedBy = "estado",  fetch = FetchType.LAZY)
    @ForeignKey(name = "Estado_Endereco")
    private List<Endereco> enderecos;

    public Estado() {
    }

    public Integer getIdEstado() {
        return IdEstado;
    }

    public void setIdEstado(Integer IdEstado) {
        this.IdEstado = IdEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.IdEstado != null ? this.IdEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (this.IdEstado != other.IdEstado && (this.IdEstado == null || !this.IdEstado.equals(other.IdEstado))) {
            return false;
        }
        return true;
    }
    
}
