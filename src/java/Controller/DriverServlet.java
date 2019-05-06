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
import Model.DriverDao;
/**
 *
 * @author HP
 */

public class DriverServlet extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String driverid = request.getParameter("driverid");
        String drivername = request.getParameter("drivername");
        String busno = request.getParameter("busno");
        String str = request.getParameter("routeno");
        int routeno = Integer.parseInt(str);
        String route = request.getParameter("route");
        
        HttpSession session = request.getSession(true);
        try{
            DriverDao access = new DriverDao();
            access.check(driverid, drivername, busno, routeno, route);
            response.sendRedirect("Driver.jsp");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
