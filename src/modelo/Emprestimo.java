/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */
@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataEmprestimo;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;
    @Column(nullable = false)
    private boolean estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
