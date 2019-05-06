package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class adminschedule1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int id;String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Admin</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<div id=\"header\">\n");
      out.write("            <img src=\"buslogo.png\" heigth=\"120px\" width=\"170px\" align=\"left\">\n");
      out.write("\t\t<div class=\"logo\"><center><a href=\"\">Bus <span>Management System</span></a></center></div>\n");
      out.write("               <img src=\"instagram.png\"><img src=\"twitter.png\"><img src=\"linkedin.png\"><img src=\"googleplus.png\">\n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("           <ul id=\"nav\">\n");
      out.write("               <li><a class=\"selected\" href=\"home.html\"><img src=\"icons8-home.png\">Home</a></li>\n");
      out.write("           \t<li><a href=\"profile.html\"><img src=\"icons8-profile.png\">Profile</a></li>\n");
      out.write("           \t<li><a href=\"adminsearch.jsp\"><img src=\"icons8-search.png\">Search</a></li>\n");
      out.write("           \t<li><a href=\"adminschedule.jsp\"><img src=\"icons8-update.png\">Schedule</a></li>\n");
      out.write("           \t<li><a href=\"viewall.html\"><img src=\"icons8-view.png\">FeedBack</a></li>\n");
      out.write("           \t<li><a href=\"index.html\"><img src=\"icons8-logout.png\">Log Out</a></li>\n");
      out.write("           </ul>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Add Schedule</h1>\n");
      out.write("                <form action=\"ScheduleServlet1\" class=\"form\">\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <input type=\"text\" name=\"busno\" class=\"form-control\" placeholder=\"Enter Your BusNo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <input type=\"text\" name=\"pickuppoint\" class=\"form-control\" placeholder=\"Enter PickupPoint\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <input type=\"text\" name=\"arrivaltime\" class=\"form-control\" placeholder=\"Enter arrivaltime\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <input type=\"text\" name=\"droppoint\" class=\"form-control\" placeholder=\"Enter Drop point\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <input type=\"text\" name=\"droptime\" class=\"form-control\" placeholder=\"Enter Drop time\">\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn\" value=\"Add Schedule\">\n");
      out.write("                <a href=\"adminschedule.jsp\" class=\"btn\">Display Schedule</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"schedule.js\"></script>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
