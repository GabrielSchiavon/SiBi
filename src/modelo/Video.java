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

    public Video(){}
    public Video(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao,
            String autor, String genero, String sinopse, double duracao, int quantLocados){
        super(nome, qtd, dataCadastro, dataCriacao, quantLocados, 1);
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
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
    
    public List consultarMaterial(int id) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        return dao.consultarMaterial(3, id);
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
    
    public List consultarMaterialID(int valor, int id) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        List resultado = null;
        
        try {
            resultado = dao.consultarMaterialID(valor, id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return resultado;
    }
    
    public void editarVideo(Video video) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.editarVideo(video);
        } catch (Exception ex){
            ex.printStackTrace();
        }   
    }
    
    public void excluirVideo(Video video) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.excluirVideo(video);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }
}
