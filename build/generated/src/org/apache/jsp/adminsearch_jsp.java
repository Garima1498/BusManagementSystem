package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class adminsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"aboutus.css\">\n");
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
      out.write("\t<div id=\"container1\">\n");
      out.write("\t\t<div class=\"sidebar\">\n");
      out.write("           <ul id=\"nav\">\n");
      out.write("               <li><a class=\"selected\" href=\"home.html\"><img src=\"icons8-home.png\">Home</a></li>\n");
      out.write("           \t<li><a href=\"profile.html\"><img src=\"icons8-profile.png\">Profile</a></li>\n");
      out.write("           \t<li><a href=\"adminsearch.jsp\"><img src=\"icons8-search.png\">Search</a></li>\n");
      out.write("           \t<li><a href=\"adminschedule.jsp\"><img src=\"icons8-update.png\">Schedule</a></li>\n");
      out.write("           \t<li><a href=\"viewall.html\"><img src=\"icons8-view.png\">FeedBack</a></li>\n");
      out.write("           \t<li><a href=\"index.html\"><img src=\"icons8-logout.png\">Log Out</a></li>\n");
      out.write("           </ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("     <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                    <div>\n");
      out.write("                        <center>\n");
      out.write("                        <form action=\"\" method=\"get\">\n");
      out.write("                            <label for=\"search\">\n");
      out.write("                            <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                            </label> \n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            <font color=\"black\"> <input class=\"input\" type=\"text\" name=\"searching\" placeholder=\"Search Here.....\"></font>\n");
      out.write("                            <br><br>\n");
      out.write("                        </form>\n");
      out.write("                            <br> <br>\n");
      out.write("                            \n");
      out.write("                            <table class=\"table table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <th>Bus No.</th>\n");
      out.write("                                        <th>Pick-Up Place</th>\n");
      out.write("                                        <th>Arrival Time</th>\n");
      out.write("                                        <th>Drop Place</th>\n");
      out.write("                                        <th>Drop Time</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    ");

                                        Configuration cf = new Configuration();
                                        cf.configure("schedule.cfg.xml");
                                        SessionFactory sf = cf.buildSessionFactory();
                                        session1 = sf.openSession();
                                        String search = request.getParameter("searching");
                                        String data;
                                        if(search != null){
                                            data = "from schedule1 where busno like '%"+search+"%' or pickuppoint like '%"+search+"%' or droppoint like '%"+search+"%'";
                                        } else {
                                            data = "from schedule1";
                                        }
                                        Query qr = session1.createQuery(data);
                                        Iterator it = qr.iterate();
                                        while(it.hasNext()){
                                        schedule1 s = (schedule1)it.next();
                                        busno = s.getBusno();
                                        pickuppoint = s.getPickuppoint();
                                        arrivaltime = s.getArrivaltime();
                                        droppoint = s.getDroppoint();
                                        droptime = s.getDroptime();
                                    
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <td>");
      out.print(busno);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(pickuppoint);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(arrivaltime);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(droppoint);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(droptime);
      out.write("</td>\n");
      out.write("                                    </tbody>\n");
      out.write("                                    ");

                                        }
                                       session1.close();
                                    
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        </center> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>  \n");
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
