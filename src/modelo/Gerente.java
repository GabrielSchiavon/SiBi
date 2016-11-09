/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import dao.PessoaDAO;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author schiavon
 */

@Entity
@Table(name = "Gerente")
public class Gerente extends Pessoa{

    @Column(nullable = false)
    private boolean status;
    /**
     * @return the gerente
     */

    public Gerente(){}
    
    public Gerente(String nome, int cpf, int rg, Calendar dataNasc,
            int cep, String endereço, String bairro, int numero, String complemento,
            String email, String senha, int sexo){
        super(nome, cpf, rg, dataNasc, cep, endereço, bairro, numero, complemento, email, senha, sexo);
        this.status = status;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
    
    
    public List buscarPessoa(int valor, String nome){
        PessoaDAO dao = new PessoaDAO();
        List resultado = null;
        
        try {
            resultado = dao.buscarPessoa(valor, nome);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return resultado;
    }
        
        
    public void editarGerente(Gerente gerente){
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.editarGerente(gerente);
        } catch (Exception ex){
            ex.printStackTrace();
        }    
    }

}
