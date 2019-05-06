/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.schedule1DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class ScheduleServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String busno = request.getParameter("busno");
        String pickuppoint = request.getParameter("pickuppoint");
        String arrivaltime = request.getParameter("arrivaltime");
        String droppoint = request.getParameter("droppoint");
        String droptime = request.getParameter("droptime");
        
        HttpSession session = request.getSession(true);
            try{
                schedule1DAO access = new schedule1DAO();
                access.check(busno,pickuppoint,arrivaltime,droppoint,droptime);
                response.sendRedirect("schedule1.jsp");
            } catch(Exception e){
                e.printStackTrace();
            }
            
            
    }

}
