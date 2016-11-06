/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import dao.MaterialBibliograficoDAO;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */
@Entity
@Table(name = "periodico")
public class Periodico extends Material{
    @Column(nullable = false)
    private String assunto;
    @Column(nullable = false)
    private int issn;
    @Column(nullable = false)
    private String doi;

    public Periodico(){}
    public Periodico(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao,
            String assunto, int issn, String doi){
        super(nome, qtd, dataCadastro, dataCriacao);
        this.assunto = assunto;
        this.issn = issn;
        this.doi = doi;
    }
    
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
    
    public String listarDados(){
        return "";
    }
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }
    
    public void cadastrarPeriodico(Periodico periodico) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.inserirPeriodico(periodico);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public List consultarMaterial(int valor, String nome){
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        List resultado = null;
        
        try {
            resultado = dao.consultarMaterial(valor, nome);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return resultado;
    }
}
