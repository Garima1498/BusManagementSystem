/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author HP
 */

@Entity
public class user {
    @Id
    private String username;
    private int password;
    private String usertype;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    public boolean equals(Object o){
        user u = (user) o;
        System.out.println(this.username+" : "+this.password+" : "+this.usertype);
        System.out.println(u.username+" : "+u.password+" : "+u.usertype);
        if( (username.equalsIgnoreCase(u.username)) &&(password == u.password)){
           return true;
        }
        else{
            return false;
        }
        
    }
    
    
}
