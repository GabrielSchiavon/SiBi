/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package controller;

import modelo.Reserva;

/**
 *
 * @author Gabriel
 */
public class ReservaController {
    public void enviarReserva(Reserva reserva) {
        reserva.realizarReserva(reserva);
    }
    
    public Reserva buscarReserva(int idMaterial, int idUsuario, int tipoMaterial) {
        Reserva reserva = new Reserva();
        return reserva.buscarReserva(idMaterial, idUsuario, tipoMaterial);
    }

    public boolean cancelarReserva(int idMaterial, int idUsuario, int tipoMaterial) {
        Reserva reserva = buscarReserva(idMaterial, idUsuario, tipoMaterial);
        return reserva.cancelarReserva(reserva);
    }
}
