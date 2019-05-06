<%-- 
    Document   : adminschedule1
    Created on : Apr 3, 2019, 7:10:36 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin</title>
	<link rel="stylesheet" type="text/css" href="style.css">
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
                <h1>Add Schedule</h1>
                <form action="ScheduleServlet1" class="form">
                <div class="form">
                    <input type="text" name="busno" class="form-control" placeholder="Enter Your BusNo">
                </div>
                <div class="form">
                    <input type="text" name="pickuppoint" class="form-control" placeholder="Enter PickupPoint">
                </div>
                <div class="form">
                    <input type="text" name="arrivaltime" class="form-control" placeholder="Enter arrivaltime">
                </div>
                <div class="form">
                    <input type="text" name="droppoint" class="form-control" placeholder="Enter Drop point">
                </div>
                <div class="form">
                    <input type="text" name="droptime" class="form-control" placeholder="Enter Drop time">
                </div>
                    <input type="submit" class="btn" value="Add Schedule"><br><br>
                <a href="adminschedule.jsp" class="btn">Display Schedule</a>
                </form>
            </div>
        </div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="schedule.js"></script>
    
     
	
</body>
</html>