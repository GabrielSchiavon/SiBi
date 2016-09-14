/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

/**
 *
 * @author schiavon
 */
public class Video extends Material{
    private String autor;
    private String genero;
    private String sinopse;
    private double duracao;
    private int quantLocados;

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
}
