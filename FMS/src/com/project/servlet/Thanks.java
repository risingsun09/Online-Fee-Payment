package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cash
 */
@WebServlet("/Thanks")
public class Thanks extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("<title>Payment</title>");
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
		        out.println("<li class='first'><a href='AccHome.jsp'>Back</a></li>");
				out.println("<li class='first'><a href='Welcome.jsp'>Home</a></li>");
			    out.println("<li><a href='Logout.jsp'>Log Out</a></form></li>");
			    out.println("</ul><br class='clear' />");
				out.println("</div>");
		out.println("<div id='main'>");	
		out.println("<center><font size='20' color='green'>THANK YOU FOR PAYMENT !!!</font></center>");
		out.println("</br>");
		out.println("<center><img src='image/Cash2.gif'/></center");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
