package com.bridgelabs.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class Myservlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out= response.getWriter();
		out.print("<h1>hello Servlet<h1>");
	}
}
