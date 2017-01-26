/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author schiavon
 */
@Entity
@Table(name = "reserva")
class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(nullable = false)
    private int idMaterial;
    @Column(nullable = false)
    private int idUsuario;
    @Column(nullable = false)
    private int proxReserva;
    @Temporal(TemporalType.DATE)
    private Date dataReserva;

    public Reserva(){
        this.proxReserva = -1;
    }
    
    public Reserva(int idMaterial, int idUsuario, Date dataReserva) {
        this.idMaterial = idMaterial;
        this.idUsuario = idUsuario;
        this.dataReserva = dataReserva;
    }

    public int getId() {
        return id;
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

    public int getProxReserva() {
        return proxReserva;
    }

    public void setProxReserva(int proxReserva) {
        this.proxReserva = proxReserva;
    }
    
    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
    
    //Falta implementar
    private boolean verificarReserva(){
        return true;
    }
}
