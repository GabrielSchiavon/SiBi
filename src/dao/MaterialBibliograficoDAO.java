/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package dao;

import java.util.List;
import org.hibernate.Transaction;
import modelo.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
    
    public void editarLivro(Livro livro) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(livro);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void editarArtigo(Artigo artigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(artigo);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void editarPeriodico(Periodico periodico) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(periodico);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void editarVideo(Video video) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(video);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public List consultarMaterial(int valor, String nome){
        Criteria crit;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        switch (valor){
            case 0:
                crit = session.createCriteria(Livro.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Livro> resultadoLivro = crit.list();
                return resultadoLivro;
                
            case 1:
                crit = session.createCriteria(Artigo.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Artigo> resultadoArtigo = crit.list();
                return resultadoArtigo;
                
            case 2:
                crit = session.createCriteria(Periodico.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Periodico> resultadoPeriodico = crit.list();
                return resultadoPeriodico;
                
            case 3:
                crit = session.createCriteria(Video.class);
                crit.add(Restrictions.eq("nome", nome));
                List<Video> resultadoVideo = crit.list();
                return resultadoVideo;
        }
        
        
        session.flush();
        session.close();
        return null;
    }

    public void excluirLivro(Livro livro) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(livro);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void excluirArtigo(Artigo artigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(artigo);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void excluirPeriodico(Periodico periodico) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(periodico);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
    
    public void excluirVideo(Video video) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.delete(video);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }
}
