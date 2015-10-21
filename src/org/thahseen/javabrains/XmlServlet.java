package org.thahseen.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println(" Hello from Get method --->"+userName);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		out.println(" Hello from Post method --->"+fName+" "+lName);
		String prof = request.getParameter("prof");
		out.println("You are " +prof);
		String[] location = request.getParameterValues("location");
		out.println("You are  at  " +location.length+ " places\n");
		for( int i=0;i< location.length;i++){
		out.println(location[i]);
		}
	}
}
