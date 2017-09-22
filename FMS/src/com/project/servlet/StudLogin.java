package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.bean.StudentBean;
import com.project.db.StudDb;

/**
 * Servlet implementation class StudLogin
 */
@WebServlet("/StudLogin")
public class StudLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int rollno=Integer.parseInt(request.getParameter( "rollno" ));
		String password=request.getParameter("password");
		boolean status=StudDb.validate(rollno, password);
		if(status){
			HttpSession session=request.getSession();
			session.setAttribute("student","true");
			request.getRequestDispatcher("StudHome").include(request, response);
		}else{
			request.setAttribute("Error","Sorry! Username or Password Error. Plz Enter Correct Detail ");
			request.getRequestDispatcher("StudentLogin.jsp").include(request, response);
		}
	}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
	}

}
