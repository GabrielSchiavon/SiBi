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
    @Column(nullable = false)
    private int quantLocados;

    public Livro(){}
    
    public Livro(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao,
            int isbn, String genero, String autor, String editora, boolean especial, int qtdLocados){
        super(nome, qtd, dataCadastro, dataCriacao);
        this.isbn = isbn;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.especial = especial;
        this.quantLocados = qtdLocados;
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

    public int getQuantLocados() {
        return quantLocados;
    }

    public void setQuantLocados(int quantLocados) {
        this.quantLocados = quantLocados;
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
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }
}
