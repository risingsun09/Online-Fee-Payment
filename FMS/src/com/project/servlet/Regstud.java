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
 * Servlet implementation class Regstud
 */
@WebServlet("/Regstud")
public class Regstud extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
	 	String email=request.getParameter("email");
		String hostel=request.getParameter("hostel");
		String course=request.getParameter("course");
		String sem=request.getParameter("sem");
		String paid=request.getParameter("paid");
		int amt=Integer.parseInt(request.getParameter("amt"));
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		StudentBean bean=new StudentBean(name,password, email, hostel, course, sem, paid, amt, address, contact);
		int status=StudDb.save(bean);
		response.sendRedirect("Viewstud");
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}