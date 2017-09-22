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

@WebServlet("/EditAccForm")
public class EditAccForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		AccountantBean bean=AccDb.getRecordById(id);
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Edit Accountant</title>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='reg'>");	
		out.print("<form action='EditAcc' method='post'>");
		out.println("<font style='color: white'><br><h1>Update Accountant Info:</h1></font><br>");
		out.print("<input type='hidden' name='id' value='"+bean.getId()+"' />");
		out.print("Name:<input type='text' name='name' value='"+bean.getName()+"'/>");
		out.print("Email:<input type='email' name='email' value='"+bean.getEmail()+"'/>");
		out.print("Password:<input type='text' name='password' value='"+bean.getPassword()+"'/>");
		out.print("Address:<textarea name='address' style='width:300px;height:100px;'>"+bean.getAddress()+"</textarea>");
		out.print("Contact No:><input type='text' name='contact' value='"+bean.getContact()+"'/>");
		out.print("<input type='submit' value='Update Accountant' id='reg-btn'/>");
		out.print("</form>");
		out.print("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
	}

}
