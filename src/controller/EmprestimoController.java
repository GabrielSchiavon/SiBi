/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package controller;

import java.util.List;
import modelo.*;
/**
 *
 * @author schiavon
 */
public class EmprestimoController {
    private Emprestimo emprestimo;
    
    public EmprestimoController() {
    }
    
    public EmprestimoController(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void emprestimoCadastro(Emprestimo emprestimo) {
        emprestimo.cadastro(emprestimo);
    }
    
    public List consultarEmprestimo(int id, Emprestimo emprestimo){
        return emprestimo.consulta(id);
    }
    
    public void enviarDevolucao(Emprestimo emprestimo){
        emprestimo.realizarDevolucao(emprestimo);
    }
}
