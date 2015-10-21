package org.thahseen.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description= "/SimpleServlet", urlPatterns= {"/SimpleServletProject1"})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SimpleServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This is the response from the get Method");
		
		System.out.println("Hello from Get method");
	}

}
