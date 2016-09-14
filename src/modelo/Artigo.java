/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author schiavon
 */
public class Artigo extends Material{
    private String categoria;
    private String autor;
    private String resumo;
    private ArrayList tags;

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

    public ArrayList getTags() {
        return tags;
    }

    public void setTags(ArrayList tags) {
        this.tags = tags;
    }
    
    public String listarDados(){
        return "";
    }
    
    @Override
    public boolean possoSerLocado(){
        return true;
    }
}
