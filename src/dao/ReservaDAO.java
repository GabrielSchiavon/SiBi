/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package dao;

import java.util.List;
import modelo.HibernateUtil;
import modelo.Reserva;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Gabriel
 */
public class ReservaDAO {
    public int getID(int idMaterial, int idUsuario) {
        Criteria crit;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        crit = session.createCriteria(Reserva.class);
        crit.add(Restrictions.eq("idMaterial", idMaterial));
        crit.add(Restrictions.eq("idUsuario", idUsuario));
        List<Reserva> resultado = crit.list();

        session.flush();
        session.close();
        
        if (resultado.isEmpty()) {
            return -1;
        } else {
            return resultado.get(0).getId();
        }
    }
    public void cadastroReserva(Reserva reserva) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(reserva);
        
        tx.commit();
        
        session.flush();
        session.close();
    }

    public Reserva buscaReserva(int idMaterial, int idUsuario, int tipoMaterial) {
        Criteria crit;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        crit = session.createCriteria(Reserva.class);
        crit.add(Restrictions.eq("idMaterial", idMaterial));
        crit.add(Restrictions.eq("idUsuario", idUsuario));
        crit.add(Restrictions.eq("tipoMaterial", tipoMaterial));
        List<Reserva> resultado = crit.list();

        session.flush();
        session.close();
        
        if (resultado.isEmpty()) {
            return null;
        } else {
            return resultado.get(0);
        }
    }
    
    public boolean setId(int idMaterial, int idUsuario, int valorId) {
        Criteria crit;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        crit = session.createCriteria(Reserva.class);
        crit.add(Restrictions.eq("idMaterial", idMaterial));
        crit.add(Restrictions.eq("idUsuario", idUsuario));
        List<Reserva> resultado = crit.list();
        
        if (!resultado.isEmpty()) {
            resultado.get(0).setId(valorId);
            session.beginTransaction();
            session.update(resultado.get(0));
            session.getTransaction().commit();
            
            session.flush();
            session.close();
            
            return true;
        }
        
        session.flush();
        session.close();
        
        return false;
    }

    public boolean cancelarReserva(Reserva reserva) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        session.delete(reserva);
        session.getTransaction().commit();

        session.flush();
        session.close();
        return true;
    }
}
