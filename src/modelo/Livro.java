/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

/**
 *
 * @author schiavon
 */
public class Livro extends Material{
    private int isbn;
    private String genero;
    private String autor;
    private String editora;
    private boolean especial;
    private int quantLocados;

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
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }
}
