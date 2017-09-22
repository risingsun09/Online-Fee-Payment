package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.bean.StudentBean;
import com.project.db.StudDb;

/**
 * Servlet implementation class EditStudForm
 */
@WebServlet("/EditStudForm")
public class EditStudForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String srollno=request.getParameter("rollno");
		int rollno=Integer.parseInt(srollno);
		StudentBean bean=StudDb.getRecordByRollno(rollno);
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Edit Student Details</title>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='reg'>");	
		out.print("<form action='EditStud' method='post'>");
		out.println("<font style='color:white'><br><h1>Update Student Info:</h1></font>");
		out.print("<input type='hidden' name='rollno' class='input' value='"+bean.getRollno()+"'/>");
		out.print("<font color='white'>Name:</font><input type='text' name='name' class='input' value='"+bean.getName()+"'/>");
		out.print("<font color='white'>Password:</font><input type='password' name='password' class='input' value='"+bean.getPassword()+"'/>");
		out.print("<font color='white'>Email:</font><input type='email' name='email' class='input' value='"+bean.getEmail()+"'/>");
		out.print("<font color='white'>Hostel Allocated:</font><input type='text' name='hostel' class='input' value='"+bean.getHostel()+"'/>");
		out.print("<font color='white'>Branch:</font><input type='text' name='course' class='input' value='"+bean.getCourse()+"'/>");
		out.print("<font color='white'>Semester:</font><input type='text' name='sem' class='input' value='"+bean.getSem()+"'/>");
		out.print("<font color='white'>Fee Paid:</font><input type='text' name='paid' class='input' value='"+bean.getPaid()+"'/>");
		out.print("<font color='white'>Amount Paid:</font><input type='text' name='amt'class='input'  value='"+bean.getAmt()+"'/>");
		out.print("<font color='white'>Address:</font><textarea name='address' id='Address'>"+bean.getAddress()+"</textarea>");
		out.print("<font color='white'>Contact No:</font><input type='text' name='contact' class='input' value='"+bean.getContact()+"'/");
		out.print("<br/><input type='submit' name='submit' id='reg-btn' value='Update'/>");
		out.print("</form>");
		out.print("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
	}

}
