package com.project.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.bean.AccountantBean;

public class AccDb {

	public static int save(AccountantBean bean){
		int status=0;
		try{
			Connection conn=DB.getDb();
			PreparedStatement ps=conn.prepareStatement("insert into database.acc_info(name,email,password,address,contact) values(?,?,?,?,?)");
			ps.setString(1,bean.getName());
			ps.setString(2,bean.getEmail());
			ps.setString(3,bean.getPassword());
			ps.setString(4,bean.getAddress());
			ps.setString(5,bean.getContact());
			status=ps.executeUpdate();
			conn.close();
		}catch(Exception ex){System.out.println(ex);}
		return status;
	}
	public static boolean validate(int id,String password){
		boolean status=false;
		try{
			Connection conn=DB.getDb();
			PreparedStatement ps=conn.prepareStatement("select * from database.acc_info where id=? and password=? ");
			ps.setInt(1,id);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			conn.close();
		}catch(Exception ex){System.out.println(ex);}
		return status;
	}
	public static int update(AccountantBean bean){
		int status=0;
		try{
			Connection conn=DB.getDb();
			PreparedStatement ps=conn.prepareStatement("update database.acc_info set name=?,email=?,password=?,address=?,contact=? where id=?");
			ps.setString(1,bean.getName());
			ps.setString(2,bean.getEmail());
			ps.setString(3,bean.getPassword());
			ps.setString(4,bean.getAddress());
			ps.setString(5,bean.getContact());
			ps.setInt(6,bean.getId());
			status=ps.executeUpdate();
			conn.close();
		}catch(Exception ex){System.out.println(ex);}
		return status;
	}	

	public static int delete(int id){
		int status=0;
		try{
			Connection conn=DB.getDb();
			PreparedStatement ps=conn.prepareStatement("delete from database.acc_info where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			conn.close();
		}catch(Exception ex){System.out.println(ex);}
		return status;
	}

	public static List<AccountantBean> getAllRecords(){
		List<AccountantBean> list=new ArrayList<AccountantBean>();
		try{
			Connection conn=DB.getDb();
			PreparedStatement ps=conn.prepareStatement("select * from database.acc_info");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				AccountantBean bean=new AccountantBean();
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setPassword(rs.getString(4));
				bean.setAddress(rs.getString(5));
				bean.setContact(rs.getString(6));
				list.add(bean);
			}
			conn.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return list;
	}

	public static AccountantBean getRecordById(int id){
		AccountantBean bean=new AccountantBean();
		try{
			Connection conn=DB.getDb();
			PreparedStatement ps=conn.prepareStatement("select * from database.acc_info where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setPassword(rs.getString(4));
				bean.setAddress(rs.getString(5));
				bean.setContact(rs.getString(6));
			}
			conn.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return bean;
	}
}
