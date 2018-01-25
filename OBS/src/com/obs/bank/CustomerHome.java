package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerHome")
public class CustomerHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CustomerHome() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<center><h1> CUSTOMER LOGIN </h1><hr/>");
		
		out.println("<a href=CheckBalance >CHECK BALANCE</a><hr>");
		
		out.println("<br/><a href=LoanSend >SEND LOAN REQUEST</a></center>");
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
