/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.user;
import Model.UserDAO;

public class log extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        int password = Integer.parseInt(request.getParameter("password"));
        String usertype = request.getParameter("usertype");
        user u = new user();
        u.setUsername(username);
        u.setPassword(password);
        u.setUsertype(usertype);
        UserDAO ud = new UserDAO();
        System.out.println(username+" : "+password);
        System.out.println("Main block");
        System.out.println(u.getUsername()+" : "+u.getPassword()+" : "+u.getUsertype());
        if(ud.check(u))
        {
            if(u.getUsertype().equalsIgnoreCase("Admin"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("home.html");
                rd.forward(request,response);
            }
            else if(u.getUsertype().equalsIgnoreCase("Student"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("student.html");
                rd.forward(request,response);
            }
            else if(u.getUsertype().equalsIgnoreCase("Faculty"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("staff.html");
                rd.forward(request,response);
            }
        }
        else
        {
           RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.forward(request,response); 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
