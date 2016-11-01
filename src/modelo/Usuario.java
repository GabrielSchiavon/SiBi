/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

/**
 *
 * @author schiavon
 */
public class Usuario extends Pessoa{ 
    private Pessoa pessoa;
    private boolean status;

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void modificarStatus(){
        
    }
    
    public boolean verificarAtrasado(){
        return true;
    }
    
    public void removerEmprestimo(int idlivro){
        
    }
    
    public void adicionarReserva(Reserva reserva){
        
    }
    
    public void renovarEmprestimo(Emprestimo emprestimo){
        
    }
}
