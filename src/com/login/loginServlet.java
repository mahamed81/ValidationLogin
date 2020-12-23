package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String uname = request.getParameter("uname");
			String password =  request.getParameter("password");
			
			PrintWriter out = response.getWriter();
			if(uname.equals("mahamed") && password.equals("Abc123")) { 	
				response.sendRedirect("loginsuccess.jsp");
				
			}else {
				
				response.sendRedirect("loginfail.jsp");
			}
			
	}

}
