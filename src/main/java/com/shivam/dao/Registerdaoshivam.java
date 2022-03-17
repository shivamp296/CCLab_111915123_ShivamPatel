package com.shivam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Registerdaoshivam {
	String firstsql= "insert into basic111915123 values(?, ?, ?, ?, ?, ?)";
	String secondsql= "insert into salary111915123 values(?, ?, ?, ?)";
	String url= "jdbc:mysql://localhost:3306/employee";
	String username= "root";
	String password= "patel";
	
	public boolean signupshivam(String employeeid, String first_name, String last_name, String dob, String contact_number, String job_role, String monthly_salary, String yearly_bonus, String pswd)
	{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st= con.prepareStatement(firstsql);
			st.setString(1, employeeid);
			st.setString(2, first_name);
			st.setString(3, last_name);
			st.setString(4, dob);
			st.setString(5, contact_number);
			st.setString(6, pswd);
			boolean rs= st.execute();
			
			PreparedStatement st2= con.prepareStatement(secondsql);
			st2.setString(1, employeeid);
			st2.setString(2, job_role);
			st2.setString(3, monthly_salary);
			st2.setString(4, yearly_bonus);
			boolean rs2= st2.execute();
				return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
