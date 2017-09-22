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
 * Servlet implementation class StudHome
 */
@WebServlet("/StudHome")
public class StudHome extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String srollno=request.getParameter("rollno");
		int rollno=Integer.parseInt(srollno);
		StudentBean bean=StudDb.getRecordByRollno(rollno);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Search Student</title>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='outer'>"
				+ "<div id='header'>"
						+ "<div id='logo'>"
								+ "<h1>UNIVERSITY INSTITUTE OF TECHNOLOGY , BURDWAN UNIVERSITY</h1>"
								+ "</div>"
								+ "</div><div id='nav'>"
								+ "<ul>"
								+ "<li><a href='StudHome'></a></li>"
								+ "<li><a href='Welcome.jsp'>Home</a></li>"
								+ "<li><a href='Logout.jsp'>Log Out</a></li></ul><br class='clear' /></div>"
								+ " <div id='container'>"
								+ "<div id='sidebar'><ul>"
								+ "<li><a href='Overview.jsp' >Overview</a></li>"
										+ "<li><a href='StudHome?rollno='"+bean.getRollno()+"'>Student Details</a></li>"
								+ "<li><a href='PayformS?rollno="+bean.getRollno()+"'>Semester Pre-Registration</a></li>"
										+ "<li><a href='#'>Fee Details and Online Payment</a></li>"
												+ "</ul></div> ");
		out.println("<div id='main'>");
		if(bean.getRollno()>0){
			out.println("<p>welcome "+bean.getName()+"</p>");
		out.println("<table cellspacing='15' cellpadding='15'>");
		out.println("<tr><td><font style='color:navy'><h1>USER PROFILE:</h1></font></td></tr>");
		out.print("<tr><td>Rollno:</td><td>"+bean.getRollno()+"</td></tr>");
		out.print("<tr><td>Name:</td><td>"+bean.getName()+"</td></tr>");
		out.print("<tr><td>Password:</td><td>"+bean.getPassword()+"</td></tr>");
		out.print("<tr><td>Email:</td><td>"+bean.getEmail()+"</td></tr>");
		out.print("<tr><td>Hostel Allocated:</td><td>"+bean.getHostel()+"</td></tr>");
		out.print("<tr><td>Branch:</td><td>"+bean.getCourse()+"</td></tr>");
		out.print("<tr><td>Semester:</td><td>"+bean.getSem()+"</td></tr>");
		out.print("<tr><td>Fee Paid:</td><td>"+bean.getPaid()+"</td></tr>");
		out.print("<tr><td>Amount Paid:</td><td>"+bean.getAmt()+"</td></tr>");
		out.print("<tr><td>Address:</td><td>"+bean.getAddress()+"</td></tr>");
		out.print("<tr><td>Contact no.:</td><td>"+bean.getContact()+"</td></tr><br/><br/>");
		out.print("</table>");
		}else{
			out.println("<p>Sorry, No Record found for "+rollno+"</p>");
		}
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
