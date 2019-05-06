/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class UserAddDao {
    
    public UserAdd Authenticate(String uname)
    {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        Transaction t = null;
        UserAdd u = null;
        try{ 
            cf = new Configuration();
            cf.configure("UserAdd.cfg.xml");
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            t = session.beginTransaction();
            Query q = session.createQuery("from UserAdd where username = :uname");
            q.setString("uname",uname);
            u = (UserAdd)q.uniqueResult();
            t.commit();
            return u;
           }catch(Exception e ){
             e.printStackTrace();
            }
        finally{
            session.close();
            sf.close();
        }
        return u;
    }
    
    
    public boolean checkStu(String uname , String pass){
        UserAdd u = null;
        u = Authenticate(uname);
        if(u!=null && uname.equals(u.getUsername()) && pass.equals(u.getPassword()) ){
            return true;
        }else{
            return false;
        }
    }
    
    
    //Admin Details
    
     /*public admin ad(String uname){
        
        Configuration cf = null;
        SessionFactory sf = null;
        Session s = null;
        Transaction t = null;
        admin a = null;
        try{
            
            cf = new Configuration();
            cf.configure("admin.cfg.xml");
            sf = cf.buildSessionFactory();
            s = sf.openSession();
            t = s.beginTransaction();
            Query q = s.createQuery("from admin where username = :uname");
            q.setString("uname", uname);
            a = (admin)q.uniqueResult();
            t.commit();
            return a;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return a;
    }
    
    public boolean checkAdmin(String uname , String pass){
        admin a = null;
        a = ad(uname);
        if(a!=null && uname.equals(a.getUsername()) && pass.equals(a.getPassword()))
            return true;
        else
            return false;
    }

    // Faculty Details
    
    public faculty fc(String uname){
        
        Configuration cf = null;
        SessionFactory sf = null;
        Session s = null;
        Transaction t = null;
        faculty f = null;
        try{
            
            cf = new Configuration();
            cf.configure("faculty.cfg.xml");
            sf = cf.buildSessionFactory();
            s = sf.openSession();
            t = s.beginTransaction();
            Query q = s.createQuery("from faculty where username = :uname");
            q.setString("uname", uname);
            f = (faculty)q.uniqueResult();
            t.commit();
            return f;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean checkFaculty(String uname , String pass){
        faculty f = null;
        f = fc(uname);
        if(f!=null && uname.equals(f.getUsername()) && pass.equals(f.getPassword()))
            return true;
        else
            return false;
    }
    */
    
    //User Registration Code
    
    
    public void check(String username,String password,int studentid,String email,String address,String mobile,int pincode){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        try{
            cf = new Configuration();
            cf.configure("UserAdd.cfg.xml");
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            Transaction tx = session.beginTransaction();
            UserAdd u = new UserAdd();
            u.setUsername(username);
            u.setPassword(password);
            u.setStudentid(studentid);
            u.setEmail(email);
            u.setAddress(address);
            u.setMobile(mobile);
            u.setPincode(pincode);
            session.save(u);
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
