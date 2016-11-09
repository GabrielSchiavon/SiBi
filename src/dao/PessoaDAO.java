/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package dao;

import java.util.List;
import modelo.Atendente;
import modelo.Biblioteconomista;
import modelo.Gerente;
import modelo.HibernateUtil;
import modelo.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author schiavon
 */
public class PessoaDAO {
    public PessoaDAO(){}
    
    public void cadastrarUsuario(Usuario usuario){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(usuario);
        
        tx.commit();
        
        session.flush();
        session.close();
    }

    public void cadastrarBiblioteconomista(Biblioteconomista biblioteconomista) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(biblioteconomista);
        
        tx.commit();
        
        session.flush();
        session.close();
    }

    
    public void cadastrarAtendente(Atendente atendente){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(atendente);
        
        tx.commit();
        
        session.flush();
        session.close();
    }


    public List buscarPessoa(int valor, String nome) {
        Criteria crit;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        switch (valor){
            case 0:
                crit = session.createCriteria(Usuario.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Usuario> resultadoUsuario = crit.list();
                return resultadoUsuario;
                
            case 1:
                crit = session.createCriteria(Gerente.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Gerente> resultadoGerente = crit.list();
                return resultadoGerente;
            case 3:
                crit = session.createCriteria(Biblioteconomista.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Biblioteconomista> resultadoBiblioteconomista = crit.list();
                return resultadoBiblioteconomista;
            case 4:
                crit = session.createCriteria(Atendente.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Atendente> resultadoAtendente = crit.list();
                return resultadoAtendente;                
        }

        session.flush();
        session.close();
        return null;    
    }
    
    public void editarUsuario(Usuario usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void editarGerente(Gerente gerente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(gerente);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }

    public void editarAtendente(Atendente atendente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(atendente);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void editarBiblioteconomista(Biblioteconomista biblioteconomista) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(biblioteconomista);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }

    public void excluirUsuario(Usuario usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(usuario);
        session.getTransaction().commit();
        
        session.flush();
        session.close();        
    }

    public void excluirAtendente(Atendente atendente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(atendente);
        session.getTransaction().commit();
        
        session.flush();
        session.close();        
    }


    public void excluirBiblioteconomista(Biblioteconomista biblioteconomista) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(biblioteconomista);
        session.getTransaction().commit();
        
        session.flush();
        session.close();        
    }



    
}
