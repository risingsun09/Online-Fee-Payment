package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.bean.StudentBean;
import com.project.db.StudDb;

/**
 * Servlet implementation class PayAcc
 */
@WebServlet("/PayAcc")
public class PayAcc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String srollno=request.getParameter("rollno");
		int rollno=Integer.parseInt(srollno);
		StudentBean bean=StudDb.getRecordByAmt(rollno);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>");
		out.println("<script type='text/javascript'>function displayForm(c){if (c.value == '2'){jQuery('#ChequeformContainer').toggle('show'); jQuery('#CashformContainer').hide();}if (c.value == '1') {jQuery('#CashformContainer').toggle('show');jQuery('#ChequeformContainer').hide();}};</script>");
		out.println("<title>Payment</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='reg'>");	
		out.println("<font style='color:white'><br><h2>PAYMENT</h2></font>");
		if(bean.getRollno()>0 && bean.getAmt()==0){
			out.println("<table cellspacing='25' cellpadding='25' width='80%'>");
			out.print("<tr><td><font color='white'>Rollno:</font></td><td><font color='white'>"+bean.getRollno()+"</font></td></tr>");
			out.print("<tr><td><font color='white'>Name:</font></td><td><font color='white'>"+bean.getName()+"</font></td></tr>");
			out.print("<tr><td><font color='white'>Email:</font></td><td><font color='white'>"+bean.getEmail()+"</font></td></tr>");
			out.print("<tr><td><font color='white'>Hostel Allocated:</font></td><td><font color='white'>"+bean.getHostel()+"</font></td></tr>");
			out.print("<tr><td><font color='white'>Branch:</font></td><td><font color='white'>"+bean.getCourse()+"</font></td></tr>");
			out.print("<tr><td><font color='white'>Semester:</font></td><td><font color='white'>"+bean.getSem()+"</font></td></tr>");
			out.print("<tr><td><font color='white'>Contact no.:</font></td><td><font color='white'>"+bean.getContact()+"</font></td></tr>");
			out.println("<tr><td><font color='white'>Pay via</font></td><td><font color='white'><input value='1' type='radio' name='formselector' id='radio' onClick='displayForm(this)'></input> Cash</font></td></tr>");
			out.println("<br>");
			out.println("<tr><td></td><td><font color='white'><input value='2' type='radio' name='formselector' id='radio' onClick='displayForm(this)'></input> Cheque/Demand Draft<br/></font></td></tr>");
			out.print("</table>");
			out.println("<div style='display:none' id='ChequeformContainer'>");
			out.println("<form id='chequeform'>");
			out.println("<label>Enter your Cheque/Demand Draft Details</label><br><br><dd>");
			out.println(" <p>Cheque/DD Number :<input type='text' minlength='16' id='cnumber' name='cnumber' value=$cnumber'/></p>");
			out.println("<p>Date:<input type='date' name='cdate' value='$cdate'/ ></p>");
			out.println("<p>Bank Name :<input type='text' name='cbank' value='$cbank'/></p> ");
			out.println(" </dd>");
			out.println("</form>");
			out.println("</div>");
			out.println(" <div id='float_right'>");
			out.print("<a href='PayForm?rollno="+bean.getRollno()+"' id='reg-btn'>Next</a><br><br><br><br>");
			out.println(" </div>");
			out.println("</form>");
			}else{
				out.print(" No dues for "+rollno+" ");
			}
		
					out.println("</div>");
					out.println("</div>");
					out.println("</body>");
					out.println("</html>");
					
					out.close();
	}

}
