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
 * @author alisson
 */

@Entity
@Table(name = "Biblioteconomista")
public class Biblioteconomista extends Pessoa{ 
    @Column(nullable = false)
    @OneToOne
    private Pessoa pessoa;
    @Column(nullable = false)
    private boolean status;
    @Column(nullable = false)
    private Calendar dataInicioTrabalho;
    @Column(nullable = false)
    private float salario;
    @Column(nullable = false)
    private int CRB;
    
    public Biblioteconomista(){}
    
    public Biblioteconomista(String nome, int cpf, int rg, Calendar dataNasc,
            int cep, String endereço, String bairro, int numero, String complemento,
            String email, String senha, int sexo){
        super(nome, cpf, rg, dataNasc, cep, endereço, bairro, numero, complemento, email, senha, sexo);
        this.status = status;
        this.salario = salario;
        this.dataInicioTrabalho = dataInicioTrabalho;
        this.CRB = CRB;
    }
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public int getCRB(){
        return CRB;
    }
    
    public void setCRB(int CRB){
        this.CRB = CRB;
    }
    
    public Calendar getDataIniciTrabalho(){
        return dataInicioTrabalho;
    }
    
    public void setDataInicioTrabalho(Calendar dataInicioTrabalho){
        this.dataInicioTrabalho = dataInicioTrabalho;
    }
        
    public void cadastrarBiblioteconomista(Biblioteconomista biblioteconomista){
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.cadastrarBiblioteconomista(biblioteconomista);
        } catch (Exception ex){
            ex.printStackTrace();
        }                
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
    
        
        
    public void editarBiblioteconomista(Biblioteconomista biblioteconomista){
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.editarBiblioteconomista(biblioteconomista);
        } catch (Exception ex){
            ex.printStackTrace();
        }    
    }

    public void excluirBiblioteconomista(Biblioteconomista biblioteconomista) {
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.excluirBiblioteconomista(biblioteconomista);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    
    
    
}
