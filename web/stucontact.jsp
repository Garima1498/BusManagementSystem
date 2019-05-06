<%-- 
    Document   : stucontact
    Created on : Apr 1, 2019, 2:16:48 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Student</title>
	<link rel="stylesheet" type="text/css" href="aboutus.css">
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Montserrat:400,700%7CPT+Serif:400,700,400italic">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat|Open+Sans">
<body>
	<div class="bgimage">
		
		<div class="menu">
			<div class="leftmenu">
				<img src="buslogo.png" heigth="120px" width="170px" align="left">
			</div>
			<div class="rightmenu">
				<ul>
					<li><a href="student.html"> Home</a></li>
                                    <li id="firstlist"> <a href="stuaboutus.html">About Us</a></li>
                                    <li> <a href="stuschedule.jsp">view</a> </li>
                                    <li> <a href="stusearch.jsp">search</a> </li>
                                        <li><a href="stucontact.html"> Contact us </a></li>
				</ul>
			</div>

                </div>

		<div class="text">
			<h2>HOME / CONTACT US </h2>
		</div>
	</div>
    <div class="para"> 
        <h1> CONTACT US </h1><br><br>
        <div class="wrap">
  <form action="contact" name="MyForm" method="POST" align="center">
    First Name:
    <input type="text" name="fname" name="firstname" placeholder="Your name.."><br><br>

    Last Name:
    <input type="text" name="lname" name="lastname" placeholder="Your last name.."><br><br>

    Subject:
    <textarea id="subject" name="feed" placeholder="Write something.."></textarea>

    <input type="submit" value="Submit">
  </form>
</div>
    </div>
</body>
</html>	
