package com.bridgelabs.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String password = "Pritesh@12";
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if (user.matches("^[A-Z][A-Za-z]{3,}") && user!= null) 
		{
			if (pass != null && pass.matches("^(?=.{8,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).*$"))

			{
				response.sendRedirect(" welcome.html");
			} else {
				//response.sendRedirect("error.html");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				PrintWriter out1 = response.getWriter();
				out1.println("<font color = red>UserName or Password Invalid</font>");
				rd.include(request, response);
			}

		}
	}

}
