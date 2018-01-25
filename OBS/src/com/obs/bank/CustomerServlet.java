package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerServlet() {
        super();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html"); 
		out.println("<center><h1>CUSTOMER DETAILS</h1><hr/>");
		out.println("<a href=AdminHome >HOME</a>");
		
		out.println("<pre><form action=Customerinsert method=post  >");
		
		out.println("NAME              <input type=text name=name />");
		
		out.println("ACCOUNT NUMBER    <input type=text name=accno />");
		
		out.println("BALANCE           <input type=text name=balance />");
		
		out.println("PASSWORD          <input type=password name=pwd />");
		
		out.println("CONFIRM PASSWORD  <input type=password name=cpwd />");
		
		out.println("<input type=submit value=SUBMIT />");
		
		
		out.println("</form></pre></center>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
