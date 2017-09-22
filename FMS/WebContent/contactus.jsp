<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<script>  
function validate(){  
var x=document.myform.email.value;

var atposition=x.indexOf("@");  
var dotposition=x.lastIndexOf(".");
  (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
	  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
	  return false;  
	  }}
</script>  
<title>FEE PAYMENT PORTAL</title>
</head>
<body>
<div id="outer">
	<div id="nav">
					<ul>
	  <li class="first"><a href="Welcome.jsp">Home</a></li>
      <li><a href="AdminLogin.jsp">ADMINISTRATOR</a></li>
      <li><a href="AccountantLogin.jsp">ACCOUNTANT</a></li>
      <li><a href="StudentLogin.jsp">STUDENT</a></li>
      <li><a href="#">Fee Structure</a></li>  
<li><a href="#">About us </a></li>
<li><a href="contactus.jsp">Contact us</a></li> 
</ul><br class="clear" />
				</div>
<Font style="color: navy;" size="4"><h1>Contact Us:</h1></Font></br>
<table>
<table><tr><td>
<table>
<tr align="left"><td><Font style="color: navy;" size="3">Contact No.:1234567890</Font><br>
<Font style="color: navy;" size="3">Email id:namami@gmail.com</Font><br>
<Font style="color: navy;" size="3">Contact Person:Namami</Font></br>
</td></tr>
</table></td><td>
<table  >
<tr align="left"><td><Font style="color: navy;" size="3">Contact No.:9999999990</Font><br>
<Font style="color: navy;" size="3">Email id:suraj@gmail.com</Font><br>
<Font style="color: navy;" size="3">Contact Person:Suraj</Font></br>
</td></tr>
</table></td><td>
<table  >
<tr align="left"><td><Font style="color: navy;" size="3">Contact No.:45677867890</Font><br>
<Font style="color: navy;" size="3">Email id:sweta@gmail.com</Font><br>
<Font style="color: navy;" size="3">Contact Person:Sweta</Font></br>
</td></tr>
</table></td><td>
</table>
<form method="post" name="myform"  action="query.jsp" onsubmit="return validate()">
<table width="55%" align="center" >
<tr><td><img src="image/i.jpg"/></td><br><br><br>
<td><Font style="color: navy;" size="3"><B>Your Query:</B></Font><br><br>
<textarea name="query" style="width: 600px; height:100px"></textarea><br>
<Font style="color: navy;" size="2"><B>Email:</B></Font><input type="email" name="email"  style="width: 250px; "/>
<input type="submit" value="submit" style="padding: 2px 2px" >
</td>
</td></tr></table>
</table>
</form>
</div>
</body>
</html>