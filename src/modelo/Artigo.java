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
@Table(name = "artigo")
public class Artigo extends Material{
    
    @Column(nullable = false)
    private String categoria;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String resumo;
    @Column(nullable = false)
    private String tags;

    public Artigo(){}
    public Artigo(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao,
            String autor, String categoria, String resumo, String tags){
        super(nome, qtd, dataCadastro, dataCriacao);
        this.categoria = categoria;
        this.autor = autor;
        this.resumo = resumo;
        this.tags = tags;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
    
    public String listarDados(){
        return "";
    }
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }

    public void cadastrarArtigo(Artigo artigo) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.inserirArtigo(artigo);
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
    
    public void editarArtigo(Artigo artigo) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.editarArtigo(artigo);
        } catch (Exception ex){
            ex.printStackTrace();
        }   
    }
    
    public void excluirArtigo(Artigo artigo) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.excluirArtigo(artigo);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }
}
