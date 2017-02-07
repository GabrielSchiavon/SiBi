/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import controller.EmprestimoController;
import controller.MaterialBibliograficoController;
import controller.PessoaController;
import controller.webmailController;
import dao.ReservaDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */
@Entity
@Table(name = "reserva")
public class Reserva implements Observer, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(nullable = false)
    private int idMaterial;
    @Column(nullable = false)
    private int idUsuario;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataReserva;
    @Column(nullable = false)
    private int tipoMaterial;

    public Reserva(){
    }
    
    public Reserva(int idMaterial, int idUsuario, Date dataReserva, int tipoMaterial) {
        this.idMaterial = idMaterial;
        this.idUsuario = idUsuario;
        this.dataReserva = dataReserva;
        this.tipoMaterial = tipoMaterial;
    }

    public int getId() {
        return id;
    }
    
    public int getId(int idMaterial, int idUsuario) {
        ReservaDAO dao = new ReservaDAO();
        return dao.getID(idMaterial, idUsuario);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
    
    public int getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
    public void realizarReserva(Reserva reserva) {
        ReservaDAO dao = new ReservaDAO();
        EmprestimoController emprestimoController = new EmprestimoController();
        Emprestimo empr = new Emprestimo();
        Emprestimo emprestimo = (Emprestimo) emprestimoController.consultarEmprestimo(
                reserva.getIdMaterial(), reserva.getIdUsuario(), empr).get(0);
        
        dao.cadastroReserva(reserva);
        emprestimo.addObserver(reserva);
    }
    
    public Reserva buscarReserva(int idMaterial, int idUsuario, int tipoMaterial){
        ReservaDAO dao = new ReservaDAO();
        return dao.buscaReserva(idMaterial, idUsuario, tipoMaterial);
    }

    public boolean setId(int idMaterial, int idUsuario, int valorId) {
        ReservaDAO dao = new ReservaDAO();
        return dao.setId(idMaterial, idUsuario, valorId);
    }

    public boolean cancelarReserva(Reserva reserva) {
        ReservaDAO dao = new ReservaDAO();
        return dao.cancelarReserva(reserva);
    }

    @Override
    public void update(Observable obj, Object arg) {
        PessoaController pessoaController = new PessoaController();
        MaterialBibliograficoController materialController = new MaterialBibliograficoController();
        webmailController mailController = new webmailController();
        Emprestimo emprestimo = (Emprestimo)obj;
        String valor = String.valueOf(arg);
        
        if (valor.equals("notificar")) {
            Usuario usuario = pessoaController.buscarUsuario(0, emprestimo.getIdUsuario());
            String email = usuario.getEmail();
            String nomeMaterial = "";
            switch (emprestimo.getTipoMaterial()) {
                case 0:
                    Livro livro = new Livro();
                    livro = (Livro) materialController.consultarMaterial(livro, 
                            emprestimo.getIdMaterial()).get(0);
                    nomeMaterial = livro.getNome();
                    break;
                case 1:
                    Artigo artigo = new Artigo();
                    artigo = (Artigo) materialController.consultarMaterial(artigo, 
                            emprestimo.getIdMaterial()).get(0);
                    nomeMaterial = artigo.getNome();
                    break;
                
                case 2:
                    Periodico periodico = new Periodico();
                    periodico = (Periodico) materialController.consultarMaterial(periodico, 
                            emprestimo.getIdMaterial()).get(0);
                    nomeMaterial = periodico.getNome();
                    break;
                
                case 3:
                    Video video = new Video();
                    video = (Video) materialController.consultarMaterial(video, 
                            emprestimo.getIdMaterial()).get(0);
                    nomeMaterial = video.getNome();
                    break;
            }
            mailController.enviarEmail(email, nomeMaterial);
        }
    }
}
