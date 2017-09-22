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
 * Servlet implementation class Viewstud
 */
@WebServlet("/ViewStudad")
public class ViewStudad extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("<title>View Student</title>");
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
				        out.println("<li><a href='AccHome.jsp'>Back</a></li>");
						out.println("<li'><a href='Welcome.jsp'>Home</a></li>");
					    out.println("<li><a href='Logout.jsp'>Log Out</a></form></li>");
						out.println("</ul><br class='clear' />");
						out.println("</div>");
						
				    out.println("<div id='main'>");
				    out.print("<center><Font style='color: navy;' size='4'><h1> STUDENT</h1></Font></center>");
				    out.print("<form action='SearchStud' method='post'>");
				    out.print("<table align='left'>");
				    out.print("<tr><td><Font style='color: navy;' size='3'>Roll no:</Font></td><td><input type='text' name='rollno' required/></td></tr>");
				    out.print("<tr><td colspan='2' align='center'><input type='submit' value='Search Student'/></td></tr></br>");
				    out.print("</table>");
				    out.print("</form>");
				    
					List<StudentBean> list=StudDb.getAllRecords();
					out.println("<center><table align='center' border='5' width='90%' cellpadding='10'>");
					out.print("<tr><Font style='color: navy;' size='4'><th>Rollno</th><th>Name</th><th>Password</th><th>Email</th><th>Hostel Allocated</th><th>Branch</th><th>Semester</th><th>Paid</th><th>Amount Paid</th><th>Address</th><th>Contact</th><th>Update</th><th>Delete</th></Font></br></br></br></br>");
					for(StudentBean bean:list){
						out.print("<tr><td>"+bean.getRollno()+"</td><td>"+bean.getName()+"</td><td>"+bean.getPassword()+"</td><td>"+bean.getEmail()+"</td><td>"+bean.getHostel()+"</td><td>"+bean.getCourse()+"</td><td>"+bean.getSem()+"</td><td>"+bean.getPaid()+"</td><td>"+bean.getAmt()+"</td><td>"+bean.getAddress()+"</td><td>"+bean.getContact()+"</td><td><a href='EditStfad?rollno="+bean.getRollno()+"'>Update</a></td><td><a href='DelStudad?rollno="+bean.getRollno()+"'>Delete</a></td></tr>");
					}
					out.println("</table></center>");
					out.println("</div>");
					out.println("</div>");
					out.println("</body>");
					out.println("</html>");
					
					out.close();
	}

}
