package com.shivam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.shivam.dao.Registerdaoshivam;

public class Registershivam extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeid= request.getParameter("eid");
		String first_name= request.getParameter("fname");
		String last_name= request.getParameter("lname");
		String dob= request.getParameter("dob");
		String contact_number= request.getParameter("contact");
		String job_role= request.getParameter("jobrole");
		String monthly_salary= request.getParameter("monthlysalary");
		String yearly_bonus= request.getParameter("yearlybonus");
		String pswd= request.getParameter("pass");
		
		Registerdaoshivam dao= new Registerdaoshivam();
		if(dao.signupshivam(employeeid, first_name, last_name, dob, contact_number, job_role, monthly_salary, yearly_bonus, pswd))
		{
			response.sendRedirect("login111915123.jsp");
		}
		else
		{
			response.sendRedirect("register111915123.jsp");
		}
	}
}
