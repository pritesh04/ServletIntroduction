package com.bridgelabs.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		String password="pritesh";
		PrintWriter out= response.getWriter();
		String user= request.getParameter("user");
		String pass = request.getParameter("pass");
		if(user.matches("^[A-Z][A-Za-z]{3,}")&& pass !=null && pass.equals(password))
		{
			response.sendRedirect(" welcome.html");
		}
		else {response.sendRedirect("error.html");};
	}
	
}
