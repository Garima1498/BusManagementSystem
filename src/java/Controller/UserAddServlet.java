/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.UserAddDao;

/**
 *
 * @author HP
 */

public class UserAddServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String str = request.getParameter("studentid");
        int studentid = Integer.parseInt(str);
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String str1 = request.getParameter("pincode");
        int pincode = Integer.parseInt(str1);
        
        HttpSession session = request.getSession(true);
        try{
            UserAddDao access = new UserAddDao();
            access.check(username,password,studentid,email,address,mobile,pincode);
            response.sendRedirect("UserAdd.jsp");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
