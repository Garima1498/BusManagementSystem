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


public class UserDAO {
   public boolean check(user original){
      
      user db = null;
      Configuration cf=null;
      SessionFactory sf=null;
      Transaction tx=null;
      Session session=null;
      try{
      cf = new Configuration();
       cf.configure("cfgPackage/hibernate.cfg.xml");
      sf = cf.buildSessionFactory();
      session = sf.openSession();
//      tx = session.beginTransaction();
//          System.out.println("chk1");
//          System.out.println(original);
//          System.out.println(original.getUsertype());
      db = (user)session.get(user.class,original.getUsername());
//      System.out.println(original.getUsername()+" "+original.getPassword());
      System.out.println(db);
          System.out.println(db.getUsername()+db.getPassword()+db.getUsertype());
System.out.println("Hello World!");
      }
      catch(Exception e)
      {
          System.out.println("chk catch");
          e.printStackTrace();
      }
      finally{
          System.out.println("chk finally");
      //tx.commit();
      session.close();
      sf.close();}
      
      if(db == null){
          System.out.println("chk if false");
         return false;
        }
      else{          
          System.out.println("chk else");
          
          boolean flag = db.equals(original);
          System.out.println(flag);
               return flag;
        }
//      else{
//          System.out.println(original.getUsername()+" "+db.getUsername());
//          System.out.println(original.getPassword()+" "+db.getPassword());
//          System.out.println(original.getUsertype()+" "+db.getUsertype());
//         return false;
//        } 
      
    }
}   