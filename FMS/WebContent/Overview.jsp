<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%>
<%@ page import="com.project.bean.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Student Panel</title>
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
					
 <li><a href="Welcome.js">Home</a></li>
<li><a href="Logout.jsp">Log Out</a></li>
</ul><br class="clear" />
				</div> 
	<div id="container">			
<div id="sidebar">
<ul>
<li class="selected"><a href="Overview.jsp" >Overview</a></li>
<li><a href="#">Student Details</a></li>
<li><a href="PayStud.jsp">Semester Pre-Registration</a></li>
<li><a href="#">Fee Details and Online Payment</a></li>
</ul>
				</div> 
				<div id="main1">
				<B>Welcome <%=request.getParameter("name")%>...<br /></B>
				
				</div></div></div>
</div>
</body>
</html>