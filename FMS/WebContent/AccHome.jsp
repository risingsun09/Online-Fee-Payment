<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Accountant Panel</title>
</head>
<body>
<div id="outer">
	<div id="header">
			
				<div id="logo">
<h1>
UNIVERSITY INSTITUTE OF TECHNOLOGY , BURDWAN UNIVERSITY
</h1>
</div>
</div>
<div id="nav">
					<ul>
 <li class="first"><a href="Welcome.jsp">Home</a></li>
 <li><a href='Regstud.jsp'>New Registration</a></li>
<li><a href="Logout.jsp">Log Out</a></form></li>
</ul><br class="clear" />
				</div> 	
<div id="container">			
<div id="sidebar">
<ul>
<li class="selected"><a href="AccHome.jsp" >Overview</a></li>
<li><a href="Viewstud">Student Details</a></li>
<li><a href="SemReg.jsp">Semester Pre-Registration</a></li>
<li><a href="DueFee">Dues List</a></li>
</ul>
				</div> 
				<div id="main1">
				<h1>ACCOUNTANT</h1>
	<B>Welcome <%=request.getParameter("name")%>...<br /></B>
<hr />	

<form action="Viewstud">
<input type="submit" value="View Student Details">
</form><br />

<form action="DueFee">
<input type="submit" value="DUE LIST">
</form><br />       
<br class="clear" />
</div></div></div>	
</body>
</html>