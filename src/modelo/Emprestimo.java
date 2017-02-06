/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import dao.EmprestimoDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
    private int idMaterial;
    @Column(nullable = false)
    private int idUsuario;
    @Column(nullable = false)
    private int tipoMaterial;
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

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public void cadastro(Emprestimo emprestimo) {
        EmprestimoDAO dao = new EmprestimoDAO();
        
        try {
            dao.cadastro(emprestimo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List consulta(int idMaterial, int idUsuario){
        EmprestimoDAO dao = new EmprestimoDAO();
        List lista;
        
        lista = dao.consultarEmprestimo(idMaterial, idUsuario);
        return lista;
    }
    
    public void realizarDevolucao(Emprestimo emprestimo) {
        EmprestimoDAO dao = new EmprestimoDAO();
        dao.devolucao(emprestimo);
    }

    public void realizarRenovacao(Emprestimo emprestimo) {
        EmprestimoDAO dao = new EmprestimoDAO();
        dao.renovacao(emprestimo);
    }
}
