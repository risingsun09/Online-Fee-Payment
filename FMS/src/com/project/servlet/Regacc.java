package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.bean.AccountantBean;
import com.project.db.AccDb;


@WebServlet("/Regacc")
public class Regacc extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		//request.getRequestDispatcher("AdminHome.jsp").include(request, response);
		
		String name=request.getParameter("name");
	 	String email=request.getParameter("email");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		AccountantBean bean=new AccountantBean(name, email, password, address, contact);
		int status=AccDb.save(bean);
		
		
		response.sendRedirect("Viewacc");
		
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
