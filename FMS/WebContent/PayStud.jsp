<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
<script type='text/javascript'>
function displayForm(c) {
    if (c.value == "2") {    
        jQuery('#paypalformContainer').toggle('show');
        jQuery('#ccformContainer').hide();
    }
        if (c.value == "1") {
         jQuery('#ccformContainer').toggle('show');
         jQuery('#paypalformContainer').hide();
    }
};
</script>
<title>Insert title here</title>
</head>
<body>

<form>
    <input value="1" type="radio" name="formselector" onClick="displayForm(this)"></input>Via Credit Card/Debit Card
    <div style="display:none" id="ccformContainer">
        <center><form id="ccform">
        <table border="2" color=blue> 
        <label>Enter your credit card details :</label>
        <br>
        <br>
        <dd>
            <p>Credit/Debit Card Name :
                <input type="text" id="ccname" name="ccname" value="$ccname">
            </p>
            <p>Credit/Debit Card Type :
                <select name="cctype" required>
                    <option value="Visa">Visa</option>
                    <option value="Mastercard">Mastercard</option>
                    <option value="American Express">American Express</option>
                    <option value="Discover">Discover</option>
                    <option value="Diners Club">Diners Club</option>
                    <option value="Maestro">Maestro</option>
                    <option value="Verified By Visa">Verified By Visa</option>
                    <option value="Visa Electron">Visa Electron</option>
                </select>
                <p>Credit/Debit Card Number :
                    <input type="text" minlength="16" id="ccnumber" name="ccnumber" value="$ccnumber">
                </p>
                <p> Expiry Date : Month :
                    <select name="ccexpdatemonth" required>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                    </select> <span>Year : <select name="ccexpdateyear" required>
                <option value="2015">2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
                <option value="2021">2021</option>
                </select></span>

                    <p> CVV :
                        <input type="text" minlength="3" id="cccvc" name="cccvc" value="$cccvc">
                    </p>
        </dd>
       
        </table>
       
        </center>
        <form>
    </div>
    <br>
    <input value="2" type="radio" name="formselector" onClick="displayForm(this)"></input>Via Paypal
    <div style="display:none" id="paypalformContainer">
        <form id="paypalform"><center><table>
        <label>Enter your Paypal Details</label>
        <br>
        <br>
        <dd>Paypal Address :
            <input type="text" id="paypal" name="paypal" value="$paypal">
        </dd>
        </form>
    </div>

    <div id="float_right">
    </center></table>
   
    </div>
</form></br></br><center>
 <form action="Thanks">
        <input type="submit" name="submit3" value="Pay Now">
        
        </form></center>

</body>
</html>