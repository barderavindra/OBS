package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.obs.mydao.MyDao;




@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		MyDao m=new MyDao();
	     int y= m.checkLogin(uid, pwd);
	  if(y==1)
		  response.sendRedirect("AdminHome");
	  else
		  out.println("Login Failed,plz Login Again...");
		
		
		
	}

}
