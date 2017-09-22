package com.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB {

	
	public static Connection getDb(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/database","root","12345678");
			return conn;
		}catch(Exception e){
			e.printStackTrace();
			return null;
			
			
			
		}
	}

}
