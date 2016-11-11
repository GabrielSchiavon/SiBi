/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Material implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int quantidadeInventario;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataCadastro;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataCriacao;
    @Column(nullable = false)
    private int quantLocados;
    
    public Material(){}
    
    public Material(String nome, int qtd, Calendar dataCadastro, Calendar dataCriacao, int quantLocados){
        this.nome = nome;
        this.quantidadeInventario = qtd;
        this.dataCadastro = dataCadastro;
        this.dataCriacao = dataCriacao;
        this.quantLocados = quantLocados;
    }
    
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

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public String getDados(){
        return "";
    }
    
    public boolean estouReservado(){
        return true;
    }
    
    public boolean possoSerLocado(){
        return ((quantidadeInventario - quantLocados) > 0);
    }

    public int getQuantLocados() {
        return quantLocados;
    }

    public void setQuantLocados(int quantLocados) {
        this.quantLocados = quantLocados;
    }
}
