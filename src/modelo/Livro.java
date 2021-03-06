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
@Table(name = "livro")
public class Livro extends Material{
    @Column(nullable = false)
    private int isbn;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String editora;
    @Column(nullable = false)
    private boolean especial;

    public Livro(){}
    
    public Livro(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao,
            int isbn, String genero, String autor, String editora, boolean especial, int qtdLocados){
        
        super(nome, qtd, dataCadastro, dataCriacao, qtdLocados, 1);
        this.isbn = isbn;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.especial = especial;
    }
    
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public String listarDados(){
        return "";
    }
    
    public void cadastrarLivro(Livro livro){
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.inserirLivro(livro);
        } catch (Exception ex){
            ex.printStackTrace();
        }                
    }
    
    public List consultarMaterial(int id) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        return dao.consultarMaterial(0, id);
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
    
    public void editarLivro(Livro livro){
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.editarLivro(livro);
        } catch (Exception ex){
            ex.printStackTrace();
        }    
    }
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }

    public void excluirLivro(Livro livro) {
        MaterialBibliograficoDAO dao = new MaterialBibliograficoDAO();
        try{
            dao.excluirLivro(livro);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
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
}
