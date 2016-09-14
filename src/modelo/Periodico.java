/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

/**
 *
 * @author schiavon
 */
public class Periodico extends Material{
    private String assunto;
    private int issn;
    private String doi;

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
}
