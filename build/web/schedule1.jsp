<html>
<head>
	<title>Student</title>
        <link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="aboutus.css">
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Montserrat:400,700%7CPT+Serif:400,700,400italic">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat|Open+Sans">
        <style>
    .form{
        width:600px;
        margin: 100px auto;
        padding: 10px;
        color: black;
        font-color:black; 
    }
    .btn{
        background-color: blue;
        color:white;
        padding: 12px 64px;
        cursor: pointer;
        
    }
</style>
<%@ page import="java.util.*,Model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! int id;String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; %>
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
  <div class="container">
            <div class="jumbotron">
                <h1>Add Schedule</h1>
                <form action="SchServlet" class="form">
                <div class="form-group">
                    <input type="text" name="busno" class="form-control" placeholder="Enter Your BusNo">
                </div>
                <div class="form-group">
                    <input type="text" name="pickuppoint" class="form-control" placeholder="Enter PickupPoint">
                </div>
                <div class="form-group">
                    <input type="text" name="arrivaltime" class="form-control" placeholder="Enter arrivaltime">
                </div>
                <div class="form-group">
                    <input type="text" name="droppoint" class="form-control" placeholder="Enter Drop point">
                </div>
                <div class="form-group">
                    <input type="text" name="droptime" class="form-control" placeholder="Enter Drop time">
                </div>
                    <input type="submit" class="btn " value="Add Schedule"><br><br>
                <a href="schedule.jsp" class="btn ">Display Schedule</a>
                </form>
            </div>
        </div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="schedule.js"></script>
</body>
</html>	
