package com.shivam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Logindaoshivam {
	String sql = "select * from basic111915123 where eid=? and password=?";
	String url = "jdbc:mysql://localhost:3306/employee";
	String username = "root";
	String password = "patel";
	public String eid,fname,lname,contact,dob,role,salary,bonus;
	
public boolean signinshivam(String id, String pass) {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			

			if(rs.next())
			{
				eid=rs.getString(1);
				fname=rs.getString(2);
				lname=rs.getString(3);
				contact=rs.getString(4);
				dob=rs.getString(5);
			}
			
			String shivamsql2 = "select * from salary111915123 where eid=?";
			PreparedStatement stshivam2 = con.prepareStatement(shivamsql2);
			stshivam2.setString(1, id);
			rs = stshivam2.executeQuery();
			
			if(rs.next())
			{
			role=rs.getString(2);
			salary=rs.getString(3);
			bonus=rs.getString(4);	
			}
				
			return true;
		} catch (Exception e) {
		
			e.printStackTrace();
		
		}
		
		return false;
	}
}
