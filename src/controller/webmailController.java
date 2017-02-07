/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package controller;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Session;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author schiavon
 */
public class webmailController {
    public webmailController(){
        
    }
    
    public boolean enviarEmail(String emailDestino, String nomeMaterial) {
        String emailRementente = "gtschiavon94@gmail.com";
        SimpleEmail email = new SimpleEmail();
        email.setSSLOnConnect(true);
        email.setHostName("smtp.gmail.com");
        email.setSslSmtpPort("465");
        email.setAuthenticator(new DefaultAuthenticator(emailRementente, "GabrieL123"));
        
        try{
            email.setFrom(emailRementente);
            email.setDebug(true);
            
            email.setSubject("Material Disponível para empréstimo");
            email.setMsg("Olá, a solicitação do material '"+nomeMaterial+
                    "' que você havia realizado reserva, já se encontra disponível na "
                            + "biblioteca para emprestimo");
            email.addTo(emailDestino);
            
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
        
        return true;
    }
    
}
