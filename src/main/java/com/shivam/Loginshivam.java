package com.shivam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.shivam.dao.Logindaoshivam;
import com.shivam.dao.Registerdaoshivam;

public class Loginshivam extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeid= request.getParameter("eid");
		String pswd= request.getParameter("pass");
		
		Logindaoshivam dao= new Logindaoshivam();
		if(dao.signinshivam(employeeid,pswd))
		{
			HttpSession session = request.getSession();
			session.setAttribute("eid", dao.eid);
			
			session.setAttribute("lname", dao.lname);
			
			session.setAttribute("fname", dao.fname);
			
			session.setAttribute("contact", dao.contact);
			
			session.setAttribute("dob", dao.dob);
			
			session.setAttribute("role", dao.role);
			
			session.setAttribute("salary", dao.salary);
			
			session.setAttribute("bonus", dao.bonus);
			
			response.sendRedirect("report.jsp");
		}
		else
		{
			response.sendRedirect("login111915123.jsp");
		}
	}
}
