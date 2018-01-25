package com.obs.bank.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBOperation {
	public static Connection start(){
		Connection con=null;
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mybank","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}


		
	}

	
	

	
	
	


