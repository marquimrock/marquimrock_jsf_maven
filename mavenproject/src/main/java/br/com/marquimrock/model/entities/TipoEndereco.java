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
@Table(name = "tipoEndereco")
public class TipoEndereco implements Serializable{
    
    private static final long serialVersionUIL = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdTipoEndereco", nullable = false)
    private Integer idTipoEndereco;
    @Column(name = "Nome", nullable = false, length = 80)
    
    @OneToMany(mappedBy = "tipoEndereco",  fetch = FetchType.LAZY)
    @ForeignKey(name = "TipoEndereco_Endereco")
    private List<TipoEndereco> tipoEndereco;

    public TipoEndereco() {
    }

    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

    public List<TipoEndereco> getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(List<TipoEndereco> tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.idTipoEndereco != null ? this.idTipoEndereco.hashCode() : 0);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (this.idTipoEndereco != other.idTipoEndereco && (this.idTipoEndereco == null || !this.idTipoEndereco.equals(other.idTipoEndereco))) {
            return false;
        }
        return true;
    }
    
}
