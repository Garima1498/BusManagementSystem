package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class schedule1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Student</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"aboutus.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Montserrat:400,700%7CPT+Serif:400,700,400italic\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat|Open+Sans\">\n");
      out.write("        <style>\n");
      out.write("    .form{\n");
      out.write("        width:600px;\n");
      out.write("        margin: 100px auto;\n");
      out.write("        padding: 10px;\n");
      out.write("        color: black;\n");
      out.write("        font-color:black; \n");
      out.write("    }\n");
      out.write("    .btn{\n");
      out.write("        background-color: blue;\n");
      out.write("        color:white;\n");
      out.write("        padding: 12px 64px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"bgimage\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"menu\">\n");
      out.write("\t\t\t<div class=\"leftmenu\">\n");
      out.write("\t\t\t\t<img src=\"buslogo.png\" heigth=\"120px\" width=\"170px\" align=\"left\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"rightmenu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"student.html\"> Home</a></li>\n");
      out.write("                                    <li id=\"firstlist\"> <a href=\"stuaboutus.html\">About Us</a></li>\n");
      out.write("                                    <li> <a href=\"stuschedule.jsp\">view</a> </li>\n");
      out.write("                                    <li> <a href=\"stusearch.jsp\">search</a> </li>\n");
      out.write("                                        <li><a href=\"stucontact.html\"> Contact us </a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"text\">\n");
      out.write("\t\t\t<h2>HOME / CONTACT US </h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Add Schedule</h1>\n");
      out.write("                <form action=\"SchServlet\" class=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"busno\" class=\"form-control\" placeholder=\"Enter Your BusNo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"pickuppoint\" class=\"form-control\" placeholder=\"Enter PickupPoint\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"arrivaltime\" class=\"form-control\" placeholder=\"Enter arrivaltime\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"droppoint\" class=\"form-control\" placeholder=\"Enter Drop point\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"droptime\" class=\"form-control\" placeholder=\"Enter Drop time\">\n");
      out.write("                </div>\n");
      out.write("                    <input type=\"submit\" class=\"btn \" value=\"Add Schedule\"><br><br>\n");
      out.write("                <a href=\"schedule.jsp\" class=\"btn \">Display Schedule</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"schedule.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
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
