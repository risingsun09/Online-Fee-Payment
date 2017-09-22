package com.project.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.project.bean.StudentBean;
public class StudDb {
	
public static int save(StudentBean bean){
	int status=0;
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("insert into database.stud_info(name,password,email,hostel,course,sem,paid,amt,address,contact) values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,bean.getName());
		ps.setString(2,bean.getPassword());
		ps.setString(3,bean.getEmail());
		ps.setString(4,bean.getHostel());
		ps.setString(5,bean.getCourse());
		ps.setString(6,bean.getSem());
		ps.setString(7,bean.getPaid());
		ps.setInt(8,bean.getAmt());
		ps.setString(9,bean.getAddress());
		ps.setString(10,bean.getContact());
		status=ps.executeUpdate();
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}

public static boolean validate(int rollno,String password){
	boolean status=false;
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select * from database.stud_info where rollno=? and password=?");
		ps.setInt(1,rollno);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}

public static int update(StudentBean bean){
	int status=0;
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("update database.stud_info set name=?,password=?,email=?,hostel=?,course=?,sem=?,paid=?,amt=?,address=?,contact=? where rollno=?");
		ps.setString(1,bean.getName());
		ps.setString(2,bean.getPassword());
		ps.setString(3,bean.getEmail());
		ps.setString(4,bean.getHostel());
		ps.setString(5,bean.getCourse());
		ps.setString(6,bean.getSem());
		ps.setString(7,bean.getPaid());
		ps.setInt(8,bean.getAmt());
		ps.setString(9,bean.getAddress());
		ps.setString(10,bean.getContact());
		ps.setInt(11,bean.getRollno());
		status=ps.executeUpdate();
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}
public static int pay(StudentBean bean){
	int status=0;
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("update database.stud_info set paid=?,amt=? where rollno=?");
		ps.setString(7,bean.getPaid());
		ps.setInt(8,bean.getAmt());
		ps.setInt(11,bean.getRollno());
		status=ps.executeUpdate();
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}


public static int delete(int rollno){
	int status=0;
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("delete from database.stud_info where rollno=?");
		ps.setInt(1,rollno);
		status=ps.executeUpdate();
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}
public static int deleteByName(String name){
	int status=0;
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("delete from database.stud_info where name=?");
		ps.setString(1,name);
		status=ps.executeUpdate();
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}

public static List<StudentBean> getAllRecords(){
	List<StudentBean> list=new ArrayList<StudentBean>();
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select * from database.stud_info");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			StudentBean bean=new StudentBean();
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setPassword(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setHostel(rs.getString(5));
			bean.setCourse(rs.getString(6));
			bean.setSem(rs.getString(7));
			bean.setPaid(rs.getString(8));
			bean.setAmt(rs.getInt(9));
			bean.setAddress(rs.getString(10));
			bean.setContact(rs.getString(11));
			list.add(bean);
		}
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return list;
}
public static List<StudentBean> getAmt(){
	List<StudentBean> list=new ArrayList<StudentBean>();
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select * from database.stud_info where amt=0");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			StudentBean bean=new StudentBean();
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setPassword(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setHostel(rs.getString(5));
			bean.setCourse(rs.getString(6));
			bean.setSem(rs.getString(7));
			bean.setPaid(rs.getString(8));
			bean.setAmt(rs.getInt(9));
			bean.setAddress(rs.getString(10));
			bean.setContact(rs.getString(11));
			list.add(bean);
		}
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return list;
}

public static StudentBean getRecordByRollno(int rollno){
	StudentBean bean=new StudentBean();
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select * from database.stud_info where rollno=?");
		ps.setInt(1,rollno);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setPassword(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setHostel(rs.getString(5));
			bean.setCourse(rs.getString(6));
			bean.setSem(rs.getString(7));
			bean.setPaid(rs.getString(8));
			bean.setAmt(rs.getInt(9));
			bean.setAddress(rs.getString(10));
			bean.setContact(rs.getString(11));
		}
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return bean;
}

public static StudentBean getRecordByPayment(int rollno){
	StudentBean bean=new StudentBean();
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select * from database.stud_info where rollno=?");
		ps.setInt(1,rollno);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			bean.setRollno(rs.getInt(1));
			bean.setPaid(rs.getString(8));
			bean.setAmt(rs.getInt(9));
		}
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return bean;
}

public static StudentBean getRecordByAmt(int rollno){
	StudentBean bean=new StudentBean();
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select * from database.stud_info where rollno=? and amt=0");
		ps.setInt(1,rollno);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setEmail(rs.getString(4));
			bean.setHostel(rs.getString(5));
			bean.setCourse(rs.getString(6));
			bean.setSem(rs.getString(7));
			bean.setPaid(rs.getString(8));
			bean.setAmt(rs.getInt(9));
			bean.setContact(rs.getString(11));
		}
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return bean;
}

public static StudentBean getData(int rollno,String password){
	StudentBean bean=new StudentBean();
	try{
		Connection conn=DB.getDb();
		PreparedStatement ps=conn.prepareStatement("select rollno,name,email,hostel,course,sem,paid,amt,contact from database.stud_info where rollno=? and password=?");
		ps.setInt(1,rollno);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setEmail(rs.getString(4));
			bean.setHostel(rs.getString(5));
			bean.setCourse(rs.getString(6));
			bean.setSem(rs.getString(7));
			bean.setPaid(rs.getString(8));
			bean.setAmt(rs.getInt(9));
			bean.setContact(rs.getString(11));
		}
		conn.close();
	}catch(Exception ex){System.out.println(ex);}
	
	return bean;
}

}
