/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverDao {
    public void check(String driverid,String drivername,String busno,int routeno,String route){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        try{
            cf = new Configuration();
            cf.configure("Driver.cfg.xml");
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            Transaction tx = session.beginTransaction();
            Driver d = new Driver();
            d.setDriverid(driverid);
            d.setDrivername(drivername);
            d.setBusno(busno);
            d.setRouteno(routeno);
            d.setRoute(route);
            session.save(d);
            tx.commit();
        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            session.close();
            sf.close();
        }
    }
}
