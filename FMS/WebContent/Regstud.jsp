<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<script type="text/javascript">  
function validateform(){  
var name=document.myform.name.value;  
var password=document.myform.password.value; 
var contact=document.myform.contact.value;
var x=document.myform.email.value;

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
<form action="Regstud" method="post"  name="myform"  onsubmit="return validateform()" >
<h2>Fill Student Detail:</h2>
<input type="text" name="name" class="textInput" placeholder="Name" required/>
<input type="password" name="password" class="textInput" placeholder="Password" required/>
<input type="email" name="email" class="textInput" placeholder="example@email.com" required/>
<font color="white">Hostel Allocated:</font><br/>
<input type="radio" name="hostel" id="radio" value="YES"/><font color="white">YES</font>
<input type="radio" name="hostel" id="radio" value="NO"/><font color="white">NO</font><br/>
<font color="white">Branch:</font>
<select name="course" id="option">
<option>CSE</option>
<option>IT</option>
<option>ECE</option>
<option>AEIE</option>
<option>CIVIL</option>
<option>ELECTRICAL</option>
</select>
<font color="white">Semester:</font>
<select name="sem" id="option">
<option>1st</option>
<option>2nd</option>
<option>3rd</option>
<option>4th</option>
<option>5th</option>
<option>6th</option>
<option>7th</option>
<option>8th</option>
</select>
<font color="white">Fee Paid?:</font><br/>
<input type="radio" name="paid" id="radio" value="YES"/><font color="white"> YES</font>
<input type="radio" name="paid" id="radio" value="NO"/> <font color="white">NO</font><br/>
<font color="white">Amount Paid:</font><input type="number" name="amt" placeholder="amount" />
<font color="white">Address:</font><textarea name="address" id="Address" ></textarea>
<input type="text" name="contact" class="input"  placeholder="mobile no."/>
<input type="submit" name="submit" id="reg-btn" value="Save Student" />
</form>
<br class="clear" />
			</div>		

</div>
</body>
</html>