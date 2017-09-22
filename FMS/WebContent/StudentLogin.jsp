<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<script type="text/javascript">
$(document).ready(function(){
	$(".input").on("focus",function(){
		$(".login").add("focused")
	})
})
</script>
<title>Student Portal</title>
</head>
<body>
<% 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					%>
			<Font style='color:white;'><h1><center>WELCOME TO THE FEE PAYMENT PORTAL</center></h1></Font></br>	
<div class="login">
<div class="front">
<span class="text">LOGIN</span>
</div>
<form  action="StudLogin" method="post" >
	<input type="text" name="rollno" class="input" placeholder="Enter UserName" required/>
	<input type="password" name="password" class="input" placeholder="Enter Password" required/>	
	<input type="hidden" name="name" required/>
	<button id="login-btn"></button>
</form>
</div>
</body>
</html>