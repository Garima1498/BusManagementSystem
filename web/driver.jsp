

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/admin.css">
    <title>Admin-DashBoard</title>
</head>
<%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
    <%! int id;String driverid;String drivername;String busno;int routeno;String route;Session session1 = null;%>
<body>
    <div class="container">
        <div class="sidebar">
            <div>
                <img src="images/logo.png" alt="Logo" width="200px" height="200px">
            </div>
            <ul>
                <li>
                    <a href="admin.html">
                        <span><i class="fa fa-home"></i></span>
                        <span>HOME</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span><i class="fa fa-user"></i></span>
                        <span>Profile</span>
                    </a>
                </li>
                <li>
                    <a href="search.jsp">
                        <span><i class="fa fa-search"></i></span>
                        <span>Search</span>
                    </a>
                </li>
                <li>
                    <a href="schedule.jsp">
                        <span><i class="fa fa-clock-o"></i></span>
                        <span>Schedule</span>
                    </a>
                </li>
                <li>
                    <a href="view.html">
                        <span><i class="fa fa-eye"></i></span>
                        <span>ViewAll</span>
                    </a>
                </li>
                <li class="last">
                    <a href="../Login/login.html">
                        <span><i class="fa fa-sign-out"></i></span>
                        <span>LogOut</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>

    <div class="container">
        <div class="jumbotron">
            <h1>All User Details</h1>
            <table class="table table-hover">
                <form action="../Driverdelete.jsp" method="post">
                <thead>
                    <th>Id</th>
                    <th>Driver Id</th>
                    <th>Driver Name</th>
                    <th>Bus Id</th>
                    <th>Route No</th>
                    <th>Route</th>
                    <th>Action</th>
                </thead>
                <%
                Configuration cf = new Configuration();
                cf.configure("Driver.cfg.xml");
                SessionFactory sf = cf.buildSessionFactory();
                session1 = sf.openSession();

                String sqr = "from Driver";
                Query qr = session1.createQuery(sqr);
                Iterator it = qr.iterate();
                while(it.hasNext()){
                    Driver d = (Driver)it.next();
                    id = d.getId();
                    driverid = d.getDriverid();
                    drivername = d.getDrivername();
                    busno = d.getBusno();
                    routeno = d.getRouteno();
                    route = d.getRoute();
                %>
                <tbody>
                    <td><%=id%></td>
                    <td><%=driverid%></td>
                    <td><%=drivername%></td>
                    <td><%=busno%></td>
                    <td><%=routeno%></td>
                    <td><%=route%></td>
                    <td><a href="../Driverupdate.jsp?id=<%=id%>&driverid=<%=driverid%>&drivername=<%=drivername%>&busno=<%=busno%>&routeno=<%=routeno%>&route=<%=route%>"  class="btn btn-warning btn-md">Update</a> 
                       <input type="checkbox" class="form-control" value="<%=id%>" name="c1"></td>
                </tbody>
                <%
                }
                session1.close();
                %>
                <tbody>
                    <td colspan="10" align="center"> <input type="submit" class="btn btn-danger btn-lg btn-block" value="Delete Selected Driver"> </td>
                </tbody>
                <tbody>
                    <td colspan="10" align="center"><a href="../Driver.jsp" class="btn btn-block btn-success btn-lg">Add Driver</a></td>
                </tbody>
                </form>
            </table>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
