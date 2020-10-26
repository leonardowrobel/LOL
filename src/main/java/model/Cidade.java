package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Leonardo
 */
@Entity
public class Cidade {
    
    @Id
    @Column()
    private long id;
    private long idUF;
    private String nome;

    public Cidade() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdUF() {
        return idUF;
    }

    public void setIdUF(long idUF) {
        this.idUF = idUF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
