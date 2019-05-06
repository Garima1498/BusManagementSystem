<html>
<head>
	<title>Student</title>
	<link rel="stylesheet" type="text/css" href="aboutus.css">
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Montserrat:400,700%7CPT+Serif:400,700,400italic">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat|Open+Sans">
        <style>
    .form{
        width:600px;
        margin: 100px auto;
        padding: 10px;
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
                    <div>
                        <form action="" method="get">
                            <label for="search">
                            <span><i class="fa fa-search"></i></span>
                            </label> 
                            <input class="input" type="text" name="searching" placeholder="Search Here.....">
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
                </div>
            </div>
    </div>  
</body>
</html>	
