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
public class PessoaController {
    public Usuario usuario;
    public Atendente atendente;
    public Gerente gerente;
    public Biblioteconomista biblioteconomista;
    
    public PessoaController(){};
    
    public PessoaController(Usuario usuario){
        this.usuario = usuario;
    }
    
    public PessoaController(Atendente atendente){
        this.atendente = atendente;
    }
    
    public PessoaController(Gerente gerente){
        this.gerente = gerente;
    }
    
    public PessoaController(Biblioteconomista biblioteconomista){
        this.biblioteconomista = biblioteconomista;
    }
    
    
    public void cadastrarUsuario(Usuario usuario){
        usuario.cadastrarUsuario(usuario);
    }
    
    public void cadastrarAtendente(Atendente atendente){
        atendente.cadastrarAtendente(atendente);
    }
    
    public void cadastrarBiblioteconomista(Biblioteconomista biblioteconomista){
        biblioteconomista.cadastrarBiblioteconomista(biblioteconomista);
    }
    
    public List buscarPessoa(int valor, String nome){
        return usuario.buscarPessoa(valor, nome);
    }
        
    public void editarUsuario(Usuario usuario) {
        usuario.editarUsuario(usuario);
    }

    public void editarAtendente(Atendente atendente){
        atendente.editarAtendente(atendente);
    }
    
    public void editarBiblioteconomista(Biblioteconomista biblioteconomista) {
        biblioteconomista.editarBiblioteconomista(biblioteconomista);
    }
    
    public void editarGerente(Gerente gerente){
        gerente.editarGerente(gerente);
    }
    
    public void excluirUsuario(Usuario usuario) {
        usuario.excluirUsuario(usuario);
    }
    
    public void excluirAtendente(Atendente atendente) {
        atendente.excluirAtendente(atendente);
    }
    
    public void excluirBiblioteconomista(Biblioteconomista biblioteconomista) {
        biblioteconomista.excluirBiblioteconomista(biblioteconomista);
    }    
    
    
}
