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
    }
   /* .btn{
	width: 100%;
	box-sizing: border-box;
	padding: 12px 5px;
	background: rgba(0,0,0,0.10);
	outline: none;
	border:none;
	border-bottom: 1px dotted #fff;
	color:#fff;
	border-radius: 5px;
	margin:5px;
	font-weight: bold;
	margin-top: 30px;
        background:#003366;
	opacity: 0.7;
}*/
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
                                    <li> <a href="schedule.jsp">view</a> </li>
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
                <h1>Arriving Time</h1>
                        <table align="center" class="table table-hover" id="table">
                            <form action="delete.jsp" method="post" class="form">
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
                                <td> <a href="update1.jsp?id=<%=id%>&busno=<%=busno%>&pickuppoint=<%=pickuppoint%>&arrivaltime=<%=arrivaltime%>&droppoint=<%=droppoint%>&droptime=<%=droptime%>"  class="btn">Update</a> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
                            <td colspan="10" align="center" width="300px"><a href="schedule1.jsp" class="btn ">Add Schedule</a></td>
                            </tbody>
                            </form>
                        </table>
                        
            </div>
        </div>
                            <script src="schedule.js"></script>
</body>
</html>	
