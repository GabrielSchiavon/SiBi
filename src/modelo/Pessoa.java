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
public abstract class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int cpf;
    @Column(nullable = false)
    private int rg;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataNasc;
    @Column(nullable = false)
    private int cep;
    @Column(nullable = false)
    private String endereço;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private String complemento;
    @Column(nullable = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private int sexo;
    
    public enum Sexo{
        FEMININO(0), MASCULINO(1);
        
        private int sexo;

        Sexo(int sexo){
           this.sexo = sexo;
        }

        public int getSexo(){return this.sexo;}
    }
    
    public Pessoa(){}
    
    public Pessoa(String nome, int cpf, int rg, Calendar dataNasc, int cep, String endereço, String bairro, int numero, String complemento, String email, String senha, int sexo) {
    this.nome = nome;
    this.cpf = cpf;
    this.rg = rg;
    this.dataNasc = dataNasc;
    this.cep = cep;
    this.endereço = endereço;
    this.bairro = bairro;
    this.numero = numero;
    this.complemento = complemento;
    this.email = email;
    this.senha = senha;
    this.sexo = sexo;    
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    
}
