/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package dao;

import java.util.List;
import modelo.Emprestimo;
import modelo.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author schiavon
 */
public class EmprestimoDAO{
    public EmprestimoDAO(){}
    
    public void cadastro(Emprestimo emprestimo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(emprestimo);
        
        tx.commit();
        
        session.flush();
        session.close();
    }
    
    public List consultarEmprestimo(int idMaterial, int idUsuario){
        Criteria crit;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        crit = session.createCriteria(Emprestimo.class);
        crit.add(Restrictions.eq("idMaterial", idMaterial));
        crit.add(Restrictions.eq("idUsuario", idUsuario));
        crit.add(Restrictions.eq("estado", true));
        List<Emprestimo> resultado = crit.list();
        
        session.flush();
        session.close();
        return resultado;
    }
    
    public void devolucao(Emprestimo emprestimo){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(emprestimo);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }

    public void renovacao(Emprestimo emprestimo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.update(emprestimo);
        session.getTransaction().commit();
        
        session.flush();
        session.close();
    }

}
