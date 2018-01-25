package com.obs.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.obs.mydao.MyDao;
import com.obs.bank.bean.customerBean;


@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewServlet() {
        super();
       
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html"); 

			
			
			   MyDao m=new MyDao();
			   ArrayList<customerBean> list=m.viewAllDetails();
					out.println("<center><table border=1 >");
					out.println("<tr><th>Customer Name</th><th>Account Number</th><th>Balance</th><th>Creation Date</th></tr>");
					out.println("<a href = AdminHome >HOME</a><hr><br>");
					
					for(customerBean e:list)
			       {
						out.println("<tr>");
						out.println("<td>"+ e.getName()+"</td>");
						out.println("<td>"+e.getAccno()+"</td>");
						out.println("<td>"+e.getBalance()+"</td>");
						out.println("<td>"+e.getCreationdate()+"</td>");
						out.println("</tr>");
					}
					out.println("</table></center>"); 
					
		}
		
	

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
