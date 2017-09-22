<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Admin Panel</title>
<script>  
function validate(){  
var name=document.myform1.name.value;  
var password=document.myform1.password.value; 
var contact=document.myform1.contact.value;
var x=document.myform1.email.value;
var atposition=x.indexOf("@");  
var dotposition=x.lastIndexOf(".");
  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
	  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
	  return false;  
	  }else if(contact.length<10 ||contact.length>10){
	alert("Pls!Enter valid Mobile NO.");
	return false; 
}
}
</script>
</head>
<body>
<div id="reg">
<form action="Regacc" method="post" name="myform1"  onsubmit="return validate()">
<h2>Fill Accountant Detail:</h2>
<font color="white">Name:</font><input type="text" name="name" class="textInput" placeholder="Name" required/>
<font color="white">Password:</font><input type="password" name="password" class="textInput" placeholder="Password" required/>
<font color="white">Email:</font><input type="email" name="email" class="textInput" placeholder="example@email.com" required/>
<font color="white">Address:</font><textarea name="address" id="Address" style="width:300px; height:100px;"></textarea>
<font color="white">Contact:</font><input type="text" name="contact" class="textInput" placeholder="mobile no."/><br/>
<button  id="reg-btn">Add Accountant</button>
</form>
<br class="clear" />
			</div>	
</body>
</html>