<%-- 
    Document   : adminsearch
    Created on : Apr 3, 2019, 7:02:04 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin</title>
	<link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="aboutus.css">
        <%@ page import="java.util.*,Model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! int id;String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; %>
</head>
<body>
	
	<div id="header">
            <img src="buslogo.png" heigth="120px" width="170px" align="left">
		<div class="logo"><center><a href="">Bus <span>Management System</span></a></center></div>
               <img src="instagram.png"><img src="twitter.png"><img src="linkedin.png"><img src="googleplus.png">
                </div>
       
	<div id="container1">
		<div class="sidebar">
           <ul id="nav">
               <li><a class="selected" href="home.html"><img src="icons8-home.png">Home</a></li>
           	<li><a href="profile.html"><img src="icons8-profile.png">Profile</a></li>
           	<li><a href="adminsearch.jsp"><img src="icons8-search.png">Search</a></li>
           	<li><a href="adminschedule.jsp"><img src="icons8-update.png">Schedule</a></li>
           	<li><a href="viewall.html"><img src="icons8-view.png">FeedBack</a></li>
           	<li><a href="index.html"><img src="icons8-logout.png">Log Out</a></li>
           </ul>
		</div>
		
            </div>
    
     <div class="container">
            <div class="jumbotron">
                    <div>
                        <center>
                        <form action="" method="get">
                            <label for="search">
                            <span><i class="fa fa-search"></i></span>
                            </label> 
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <font-color="black"> <input class="input" type="text" name="searching" placeholder="Search Here....."></font>
                            <br><br>
                        </form>
                            <br> <br>
                            
                            <table class="table table-hover">
                                    <thead>
                                        <th>Bus No.</th>
                                        <th>Pick-Up Place</th>
                                        <th>Arrival Time</th>
                                        <th>Drop Place</th>
                                        <th>Drop Time</th>
                                    </thead>
                                    <%
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
                                    %>
                                    <tbody>
                                        <td><%=busno%></td>
                                        <td><%=pickuppoint%></td>
                                        <td><%=arrivaltime%></td>
                                        <td><%=droppoint%></td>
                                        <td><%=droptime%></td>
                                    </tbody>
                                    <%
                                        }
                                       session1.close();
                                    %>
                        </table>
                        </center> 
                </div>
            </div>
    </div>  
	
</body>
</html>