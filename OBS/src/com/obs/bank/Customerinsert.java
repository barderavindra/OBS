package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.obs.bank.db.DBOperation;

@WebServlet("/Customerinsert")
public class Customerinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Customerinsert() {
        super();
        
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String accno=request.getParameter("accno");
		String balance=request.getParameter("balance");
		String pwd=request.getParameter("pwd");
		String cpwd=request.getParameter("cpwd");
		PrintWriter out=response.getWriter();
		try(Connection con=new DBOperation().start())
		{
			PreparedStatement ps=con.prepareStatement("insert into customer(name,accno,balance,password)values(?,?,?,?)");
			
			ps.setString(1,name);
			ps.setInt(2,Integer.parseInt(accno));
			ps.setDouble(3,Double.parseDouble(balance));
			ps.setString(4,pwd);
			int x=0;
			if(pwd.equals(cpwd))
			x=ps.executeUpdate();
			else
			out.println("<font size =10 color=red>PASSWORD NOT MATCH PLEASE INSERT RIGHT PASSWORD</font>");
			if(x!=0)
		    out.println("ACCOUNT DETAILS IS INSERTED ");
			response.setContentType("text/html");
			out.println("<a href=AdminHome > HOME</a>");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	
	
	}

}
