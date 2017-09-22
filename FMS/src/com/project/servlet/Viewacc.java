package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.bean.AccountantBean;
import com.project.db.AccDb;


@WebServlet("/Viewacc")
public class Viewacc extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("<title>View Accountant</title>");
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
										       
	    out.println("<div id='main'>");
		out.print("<center><Font style='color: navy;' size='4'><h1> ACCOUNTANT</h1></Font></center></br></br>");
		out.print("<a href='AddAcc'><Font style='color: navy;' size='6'><b>Add Accountant</b></font></a><br/><br/>");
		
		
		List<AccountantBean> list=AccDb.getAllRecords();
		out.println("<center><table align='center' border='5' width='90%' cellpadding='10'>");
		out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>address</th><th>contact</th><th>Edit</th><th>Delete</th></tr>");
		for(AccountantBean bean:list){
			out.print("<tr><td>"+bean.getId()+"</td><td>"+bean.getName()+"</td><td>"+bean.getEmail()+"</td><td>"+bean.getPassword()+"</td><td>"+bean.getAddress()+"</td><td>"+bean.getContact()+"</td><td><a href='EditAccForm?id="+bean.getId()+"'>Edit</a></td><td><a href='DelAcc?id="+bean.getId()+"'>Delete</a></td></tr>");
		}
		out.println("</table></center>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}

