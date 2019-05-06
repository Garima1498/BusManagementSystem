<%-- 
    Document   : adminschedule
    Created on : Apr 3, 2019, 7:09:55 AM
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
       
	<div id="container">
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
                <center><h1>Arriving Time</h1></center>
                        <table align="center" class="table table-hover" id="table">
                            <form action="delete.jsp" method="post">
                              <thead>
                                <th>Id</th>
                                <th>Bus No.</th>
                                <th>PickUp Point</th>
                                <th>Arrival Time</th>
                                <th>Drop Point</th>
                                <th>Drop Time</th>
                                <th>Action</th>
                            </thead>
                            <%
                            Configuration cf = new Configuration();
                            cf.configure("schedule.cfg.xml");
                            SessionFactory sf = cf.buildSessionFactory();
                            session1 = sf.openSession();

                            String sqr = "from schedule1";
                            Query qr = session1.createQuery(sqr);
                            Iterator it = qr.iterate();
                            while(it.hasNext()){
                                schedule1 s = (schedule1)it.next();
                                id = s.getId();
                                busno = s.getBusno();
                                pickuppoint = s.getPickuppoint();
                                arrivaltime = s.getArrivaltime();
                                droppoint = s.getDroppoint();
                                droptime = s.getDroptime();
                            %>
                            <tbody>
                                <td><%=id%></td>
                                <td><%=busno%></td>
                                <td><%=pickuppoint%></td>
                                <td><%=arrivaltime%></td>
                                <td><%=droppoint%></td>
                                <td><%=droptime%></td>
                                <td> <a href="update1.jsp?id=<%=id%>&busno=<%=busno%>&pickuppoint=<%=pickuppoint%>&arrivaltime=<%=arrivaltime%>&droppoint=<%=droppoint%>&droptime=<%=droptime%>"  class="btn btn-warning btn-md">Update</a> 
                                    <input type="checkbox" class="form-control" value="<%=id%>" name="c1"></td>
                            </tbody>
                            <%
                            }
                            session1.close();
                            %>
                            <tbody>
                            <td colspan="10" align="center"> <input type="submit"  value="Delete Selected Schedule"> </td>
                            </tbody>
                            <tbody>
                            <td colspan="10" align="center"><a href="adminschedule1.jsp" ">Add Schedule</a></td>
                            </tbody>
                            </form>
                        </table>
                        
            </div>
        </div>
                            <script src="schedule.js"></script>
    
     
	
</body>
</html>
