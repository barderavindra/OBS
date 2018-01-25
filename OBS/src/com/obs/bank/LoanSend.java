package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoanSend
 */
@WebServlet("/LoanSend")
public class LoanSend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoanSend() {
        super();
        
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html"); 
			out.println("<center><h1> LOAN REQUEST TO ADMIN  </h1><hr/>");
			out.println("<a href= CustomerHome > CustomerHOME</a>");
			
			out.println("<pre><form action=Loaninsert method=post  >");
			
			out.println("NAME OF CUSTOMER  <input type=text name=name /><br>");
			
			out.println("ACCOUNT NUMBER    <input type=text name=accno /><br>");
			
			
			out.println("LOAN_AMOUNT       <input type=text name=loan_amount /><br><hr>");
			
			
			out.println("<input type=submit value = SUBMIT REQUEST />");
			
			
			out.println("</form></pre></center>");
		
		
		
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
