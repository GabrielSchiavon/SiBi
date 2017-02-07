/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import dao.PessoaDAO;
import modelo.Livro;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author schiavon
 */

@Entity
@Table(name = "Usuario")
public class Usuario extends Pessoa{ 

    @Column(nullable = false)
    private boolean status;
    
    public Usuario(){}
    
    public Usuario(String nome, int cpf, int rg, Calendar dataNasc,
            int cep, String endereço, String bairro, int numero, String complemento,
            String email, String senha, int sexo, boolean status){
    super(nome, cpf, rg, dataNasc, cep, endereço, bairro, numero, complemento, email, senha, sexo);
    this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
    public boolean verificarAtrasado(){
        return true;
    }
    
    public void removerEmprestimo(int idlivro){
        
    }
    
    public void adicionarReserva(){

    }
    
    public void renovarEmprestimo(Emprestimo emprestimo){
        
        
    }
    
    public void cadastrarUsuario(Usuario usuario){
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.cadastrarUsuario(usuario);
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
    
    public Usuario buscarUsuario(int valor, int id) {
        PessoaDAO dao = new PessoaDAO();
        List<Usuario> resultado = dao.buscarPessoa(valor, id);
        if (resultado.isEmpty()) {
            return null;
        } else {
            return (Usuario) resultado.get(0);
        }
    }    
        
    public void editarUsuario(Usuario usuario){
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.editarUsuario(usuario);
        } catch (Exception ex){
            ex.printStackTrace();
        }    
    }
    
    public void excluirUsuario(Usuario usuario) {
        PessoaDAO dao = new PessoaDAO();
        try{
            dao.excluirUsuario(usuario);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }
    
    
}
