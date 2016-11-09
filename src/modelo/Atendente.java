package modelo;

import dao.PessoaDAO;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author alisson
 */

@Entity
@Table(name = "Atendente")
public class Atendente extends Pessoa{


    @Column(nullable = false)
    private Calendar dataInicioTrabalho;
    @Column(nullable = false)
    private float salario;
    
    public Atendente(){}

    public Atendente(String nome, int cpf, int rg, Calendar dataNasc,
            int cep, String endereço, String bairro, int numero, String complemento,
            String email, String senha, int sexo){
    super(nome, cpf, rg, dataNasc, cep, endereço, bairro, numero, complemento, 
            email, senha, sexo);
    this.dataInicioTrabalho = dataInicioTrabalho;
    this.salario = salario;
    }
    
    
    public Calendar getDataInicioTrabalho(){
        return dataInicioTrabalho;
    }
    
    public void setDataInicioTrabalho(Calendar dataInicioTrabalho){
        this.dataInicioTrabalho = dataInicioTrabalho;
    }

    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    

    public void cadastrarAtendente(Atendente atendente) {
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.cadastrarAtendente(atendente);
        } catch (Exception ex){
            ex.printStackTrace();
        }          
    }

    public List buscarPessoa(int valor, String nome) {
        PessoaDAO dao = new PessoaDAO();
        List resultado = null;
        
        try {
            resultado = dao.buscarPessoa(valor, nome);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return resultado;    }

    public void editarAtendente(Atendente atendente) {
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.editarAtendente(atendente);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }

    public void excluirAtendente(Atendente atendente) {
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.excluirAtendente(atendente);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}
