<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Insert title here</title>
</head>
<body>

<% 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					%>
<Font style='color: white;'><h1><center>ACCOUNTANT</center></h1></Font></br>

<div class="login">
<div class="front">
<span class="text">LOGIN</span>
</div>
<form action="AccountantLogin" method="post">
	<center><input type="text" name="id" placeholder="Enter UserId" required/>
	<input type="password" name="password" placeholder="Enter Password" required/>	
	<input type="submit" id="login-btn" value="log In"/></center>
</form>
</div>
</body>
</html>