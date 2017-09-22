<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<li><a href="AccHome.jsp" >Overview</a></li>
<li><a href="Viewstud">Student Details</a></li>
<li class="selected"><a href="SemReg.jsp">Semester Pre-Registration</a></li>
<li><a href="DueFee">Dues List</a></li>
</ul>
				</div> 
				<div id="main1">
<table>
<tr><td><Font style='color: navy;' size='3'>Make Payment For:</Font></td><td><form action="PayAcc"><input type="text" name="rollno" class="textInput" placeholder="Roll No" required/></td></tr>
<tr><td></td><td align ='right'><button type="submit">Proceed</button> </td></tr>
</form>
</table>
<br /><br />
</div></div></div>	
</body>
</html>