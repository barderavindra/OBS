package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminHome() {
        super();
        
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<center><h1> Admin Login</h1><hr/>");
			
			out.println("<a href=CustomerServlet >CREATE NEW CUSTOMER ACCOUNT</a><hr>");
			
			out.println("<br/><a href=ViewServlet >VIEW ALL CUSTOMER ACCOUNT'S</a><hr>");
			
			out.println("<br/><a href=ViewLoan >VIEW LOAN REQUEST FROM CUSTOMR</a><hr></center>");
				
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
