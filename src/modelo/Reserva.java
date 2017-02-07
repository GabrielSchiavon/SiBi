/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import dao.ReservaDAO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */
@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {
    
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
        dao.cadastroReserva(reserva);
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
}
