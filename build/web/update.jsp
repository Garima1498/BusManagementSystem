<%-- 
    Document   : update
    Created on : Apr 2, 2019, 10:09:12 PM
    Author     : HP
--%>

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
					<li><a href="staff.html"> Home</a></li>
                                    <li id="firstlist"> <a href="staffabout.html">About Us</a></li>
                                    <li> <a href="schedule.jap">view</a> </li>
                                    <li> <a href="search.jsp">search</a> </li>
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
                <%
                String str = request.getParameter("id");
                String busno = request.getParameter("busno");
                String pickuppoint = request.getParameter("pickuppoint");
                String arrivaltime = request.getParameter("arrivaltime");
                String droppoint = request.getParameter("droppoint");
                String droptime = request.getParameter("droptime");
                String sub = request.getParameter("s1");
                if(sub!=null){
                    int id = Integer.parseInt(str);
                    try{
                        Configuration cf = new Configuration();
                        cf.configure("schedule.cfg.xml");
                        SessionFactory sf = cf.buildSessionFactory();
                        session1 = sf.openSession();
                        Transaction tx = session1.beginTransaction();
                        schedule1 s = (schedule1)session1.get(schedule1.class,id);
                        s.setBusno(busno);
                        s.setPickuppoint(pickuppoint);
                        s.setArrivaltime(arrivaltime);
                        s.setDroppoint(droppoint);
                        s.setDroptime(droptime);
                        session1.update(s);
                        response.sendRedirect("schedule.jsp");
                        tx.commit();
                    } catch(Exception e){
                        System.out.println(e);
                    } finally{
                        session1.close();
                    }
                }
                %>
                <form class="form" name="f1">  
                <div class="form-group">
                    <input type="hidden" name="id" value="<%=str%>">
                    <input type="text" name="busno" value="<%=busno%>" class="form-control" plcaeholder="Enter BusNo">
                </div>
                <div class="form-group">
                    <input type="text" name="pickuppoint" value="<%=pickuppoint%>" class="form-control" placeholder="Enter Pickuppoint" >
                </div>
                <div class="form-group">
                    <input type="text" name="arrivaltime" value="<%=arrivaltime%>" class="form-control" plcaeholder="Enter ArrivalTime">
                </div>
                <div class="form-group">
                    <input type="text" name="droppoint" value="<%=droppoint%>" class="form-control" placeholder="Enter DropPoint">
                </div>
                <div class="form-group">
                    <input type="text" name="droptime" value="<%=droptime%>" class="form-control" placeholder="Enter DropTime">
                </div>
                <input name="s1" type="submit" class="btn btn-block btn-primary btn-lg" value="Update Schedule">
                <a href="schedule.jsp" class="btn btn-block btn-success btn-lg">Display Schedule</a>
                </form>
            </div>
        </div> 
                <script src="schedule.js">
</body>
</html>	

