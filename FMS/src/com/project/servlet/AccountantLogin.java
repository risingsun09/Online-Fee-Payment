package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.db.AccDb;

@WebServlet("/AccountantLogin")
public class AccountantLogin extends HttpServlet {
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Accountant Panel</title>");
		out.println("</head>");
		out.println("<body>");
		
		
		int id=Integer.parseInt(request.getParameter( "id" ));
		String password=request.getParameter("password");
		boolean status=AccDb.validate(id, password);
		if(status){
			HttpSession session=request.getSession();
			session.setAttribute("accountant","true");
			request.getRequestDispatcher("AccHome.jsp").include(request, response);
		}else{
			request.setAttribute("Error","Sorry! Userid or Password Error. Plz Enter Correct Detail ");
			request.getRequestDispatcher("AccountantLogin.jsp").include(request, response);
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
