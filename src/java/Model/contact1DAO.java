/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Model.contact1;
/**
 *
 * @author HP
 */
public class contact1DAO {
    public void addFormDetails(String fname, String lname, String feed) {
        try {
            Configuration configuration = new Configuration().configure("cfgPackage/hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            contact1 form = new contact1();
            form.setFname(fname);
            form.setLname(lname);
            form.setFeed(feed);
            
            session.save(form);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
 
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
 
    }  
}
