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
@Table(name = "tipoLogradouro")
public class TipoLogradouro implements Serializable{
    
    private static final long serialVersionUIL = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdTipoLogradouro", nullable = false)
    private Integer idTipoLogradouro;
    @Column(name = "Nome", nullable = false, length = 80)
    
    @OneToMany(mappedBy = "tipoLogradouro",  fetch = FetchType.LAZY)
    @ForeignKey(name = "TipoLogradouro_Endereco")
    private List<TipoLogradouro> tipoLogradouro;

    public TipoLogradouro() {
    }

    public Integer getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public List<TipoLogradouro> getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(List<TipoLogradouro> tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.idTipoLogradouro != null ? this.idTipoLogradouro.hashCode() : 0);
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
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (this.idTipoLogradouro != other.idTipoLogradouro && (this.idTipoLogradouro == null || !this.idTipoLogradouro.equals(other.idTipoLogradouro))) {
            return false;
        }
        return true;
    }
    
}
