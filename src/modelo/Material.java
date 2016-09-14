/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import java.util.Date;

/**
 *
 * @author schiavon
 */
public class Material {
    private int id;
    private String nome;
    private int quantidadeInventario;
    private Date dataCadastro;
    private Date dataCriacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeInventario() {
        return quantidadeInventario;
    }

    public void setQuantidadeInventario(int quantidadeInventario) {
        this.quantidadeInventario = quantidadeInventario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public String getDados(){
        return "";
    }
    
    public boolean estouReservado(){
        return true;
    }
    
    public boolean possoSerLocado(){
        return true;
    }
}
