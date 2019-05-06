<%-- 
    Document   : createschedule
    Created on : Apr 1, 2019, 9:27:26 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin</title>
	<link rel="stylesheet" type="text/css" href="style.css">
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
           	<li><a href="search.html"><img src="icons8-search.png">Search</a></li>
           	<li><a href="update.html"><img src="icons8-update.png">Update</a></li>
           	<li><a href="viewall.html"><img src="icons8-view.png">FeedBack</a></li>
           	<li><a href="index.html"><img src="icons8-logout.png">Log Out</a></li>
           </ul>
		</div>
            <br><br>
            <div class="wrap">
    	<form action="CreateSchedule" name="MyForm" method="POST" align="center">
            DRIVER NAME:<input type="text" name="dname" placeholder="Driver name" ><br>
            DRIVER ID:<input type="text" name="bid" placeholder="Driver id" ><br>
            BUS NO.:<input type="text" name="bno" placeholder="Bus Number" ><br>
            ROUTE NO.:<input type="text" name="rno" placeholder="Route Number" ><br>
    		TIMING<input type="text" name="time" placeholder="timing" >
    		<input type="submit" value="submit">
    	</form>
    </div>
	</div>
</body>
</html>


