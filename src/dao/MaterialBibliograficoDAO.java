/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package dao;

import org.hibernate.Transaction;
import modelo.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author schiavon
 */
public class MaterialBibliograficoDAO {
    public MaterialBibliograficoDAO(){}
    
    public void inserirLivro(Livro livro){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(livro);
        
        tx.commit();
        
        session.flush();
        session.close();
    }
    
    public void inserirArtigo(Artigo artigo){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(artigo);
        
        tx.commit();
        
        session.flush();
        session.close();
    }
    
    public void inserirPeriodico(Periodico periodico){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(periodico);
        
        tx.commit();
        
        session.flush();
        session.close();
    }
    
    public void inserirVideo(Video video){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(video);
        
        tx.commit();
        
        session.flush();
        session.close();
    }
}
