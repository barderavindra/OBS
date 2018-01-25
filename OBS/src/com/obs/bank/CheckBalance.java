package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.obs.mydao.MyDao;



@WebServlet("/CheckBalance")
public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public CheckBalance() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session = request.getSession();
		
		String uid = (String)session.getAttribute("uid");
		System.out.println(uid);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html"); 

	
		   MyDao m=new MyDao();
		double d= m.viewBalance(uid);
		out.println("<center><h1> balance in your Account is<h1> " +d);  
		
		//out.println(" <h1>balance in your Account is<h1>"+ d);
		out.println("</center>");		
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
