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
 * Servlet implementation class DueFee
 */
@WebServlet("/DueFee")
public class DueFee extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='outer'>");
		out.println("<div id='header'>");
		
				out.println("<div id='logo'>");
				out.println("<h1>UNIVERSITY INSTITUTE OF TECHNOLOGY , BURDWAN UNIVERSITY</h1>");
				out.println("</div>");
				out.println("</div>");
				out.println("<div id='nav'>");
				out.println("<ul>");
						out.println("<li class='first'><a href='Welcome.jsp'>Home</a></li>");
					    out.println("<li><a href='Logout.jsp'>Log Out</a></form></li>");
					    out.println("</ul><br class='clear' />");
						out.println("</div>");
						out.println("<div id='container'>"
								+ "<div id='sidebar'>"
								+ "<ul>"
								+ "<li><a href='AccHome.jsp' >Overview</a></li>"
								+ "<li><a href='Viewstud'>Student Details</a></li>"
								+ "<li><a href='SemReg.jsp'>Semester Pre-Registration</a></li>"
								+ "<li class='selected'><a href='DueFee'>Dues List</a></li>"
								+ "</ul>"
								+ "</div> "); 
				    out.println("<div id='main1'>");					
				    out.println("<center><h1 style='color: navy;'>DUES</h1></center>");
		List<StudentBean> list=StudDb.getAmt();
		out.println("<center><table align='center' border='5' width='90%' cellpadding='10'>");
		out.print("<tr><th>Rollno</th><th>Name</th><th>Email</th><th>Hostel</th><th>Course</th><th>Semester</th><th>paid</th><th>Amount Paid</th><th>Address</th><th>Contact</th></br></br>");
		for(StudentBean bean:list){
			out.print("<tr><td>"+bean.getRollno()+"</td><td>"+bean.getName()+"</td><td>"+bean.getEmail()+"</td><td>"+bean.getHostel()+"</td><td>"+bean.getCourse()+"</td><td>"+bean.getSem()+"</td><td>"+bean.getPaid()+"</td><td>"+bean.getAmt()+"</td><td>"+bean.getAddress()+"</td><td>"+bean.getContact()+"</td></tr>");
		}
		out.println("</table></center>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	
	}

}
