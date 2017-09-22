<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="com.project.db.DB" %>
<%try{
	Connection conn=DB.getDb();
	PreparedStatement ps=conn.prepareStatement("insert into query values(?,?)");
String query=request.getParameter("query");
String email=request.getParameter("email");
ps.setString(1,query);
ps.setString(2,email);
int s=ps.executeUpdate();
}catch(Exception e){e.printStackTrace();}
%>
<jsp:forward page="Welcome.jsp"></jsp:forward>