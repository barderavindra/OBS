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


/**
 * Servlet implementation class LoanRequest
 */
@WebServlet("/LoanRequest")
public class LoanRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoanRequest() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String accno=request.getParameter("accno");
		String loan_amount=request.getParameter("loan_amount");
		PrintWriter out=response.getWriter();
		try(Connection con = DBOperation.start())
		{
			PreparedStatement ps=con.prepareStatement("insert into loan(name,accno,loan_amount)values(?,?,?)");
			
			ps.setString(1,name);
			ps.setInt(2,Integer.parseInt(accno));
			ps.setDouble(3,Double.parseDouble(loan_amount));
			int x=0;
			x=ps.executeUpdate();
			if(x!=0)
		    out.println("REQUEST SENT SUCCESSFULLY");
			response.setContentType("text/html");
			out.println("<a href=CustomerHome >HOME</a>");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
		

}
