<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Admin Panel</title>
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
<li class="first"><a href='AdminHome.jsp'>Back</a></li>
 <li><a href="Welcome.jsp">Home</a></li>
<li><a href="Logout.jsp">Log Out</a></form></li>
</ul><br class="clear" />
				</div> 
	<h1>ADMINISTRATOR</h1><br /><br />
	<B>Welcome Mr.ADMIN<br /></B>
<hr />		
<div id="main">
<center>
<form action="Viewacc">
<input type="submit" value="ACCOUNTANT">
</form><br/>

<form action="ViewStudad">
<input type="submit" value="STUDENT">
</form></br>

<form action="DueFee">
<input type="submit" value="DUE FEE ">
</form></br>

<form action="queries">
<input type="submit" value="QUERIES FROM USERS">
</form>
</center>
<br class="clear" />
			</div>		
</div>
</body>
</html>
</body>
</html>