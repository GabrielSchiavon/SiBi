/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import dao.MaterialBibliograficoDAO;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */
@Entity
@Table(name = "video")
public class Video extends Material{
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String sinopse;
    @Column(nullable = false)
    private double duracao;
    @Column(nullable = false)
    private int quantLocados;

    public Video(){}
    public Video(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao,
            String autor, String genero, String sinopse, double duracao, int quantLocados){
        super(nome, qtd, dataCadastro, dataCriacao);
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.quantLocados = quantLocados;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getQuantLocados() {
        return quantLocados;
    }

    public void setQuantLocados(int quantLocados) {
        this.quantLocados = quantLocados;
    }
    
    public String listarDados(){
        return "";
    }
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }
    
    public void cadastrarVideo(Video video) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.inserirVideo(video);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }
}
