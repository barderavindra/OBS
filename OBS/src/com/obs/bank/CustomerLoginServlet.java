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



/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public CustomerLoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String uid=request.getParameter("uid");
			String pwd=request.getParameter("pwd");
			PrintWriter out=response.getWriter();
			
			HttpSession session = request.getSession();
			session.setAttribute("uid", uid);
			
		   MyDao m=new MyDao();
		     int y= m.checkCustomerLogin(uid, pwd);
		  if(y==1)
			  response.sendRedirect("CustomerHome");
		  else
			  out.println("Login Fail,Try Again...");
		}

	
		
	}


