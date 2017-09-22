package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Admin Panel</title>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		if(uname.equals("12345")&&pass.equals("12345")){
			HttpSession session=request.getSession();
			session.setAttribute("userid",uname);
			request.getRequestDispatcher("AdminHome.jsp").include(request, response);
		}else{
			request.setAttribute("Error","Sorry! Username or Password Error. Plz Enter Correct Detail ");
			request.getRequestDispatcher("AdminLogin.jsp").include(request, response);
		}
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
