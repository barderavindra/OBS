package com.obs.mydao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.obs.bank.bean.customerBean;
import com.obs.bank.db.DBOperation;



public class MyDao {
	public int checkLogin(String uid,String pwd)
	{
		int x=0;
		try(Connection con=new DBOperation().start())
		{
			PreparedStatement ps=con.prepareStatement("select * from loginadmin where uid=? and password=?");
			ps.setString(1,uid);
			ps.setString(2,pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				x=1;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return x;

	}
	public ArrayList<customerBean> viewAllDetails()
	{
	 ArrayList<customerBean> list=new ArrayList<>();
	 try(Connection con=new DBOperation().start())
		{
			PreparedStatement ps=con.prepareStatement("select * from customer");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				customerBean e=new customerBean();
				e.setName(rs.getString("name"));
				e.setAccno(rs.getInt("accno"));
				e.setBalance(rs.getDouble("balance"));
				e.setPassword(rs.getString("password"));
				e.setCreationdate(rs.getString("creationdate"));
				list.add(e);
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public int checkCustomerLogin(String uid,String pwd)
	{
		int x=0;
		try(Connection con=new DBOperation().start())
		{
			PreparedStatement ps=con.prepareStatement("select * from customer where name=? and password=?");
			ps.setString(1,uid);
			ps.setString(2,pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				x=1;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return x;

}
	public ArrayList<customerBean> viewAllDetailsLoan()
	{
	 ArrayList<customerBean> list=new ArrayList<>();
	 try(Connection con=new DBOperation().start())
		{
			PreparedStatement ps=con.prepareStatement("select * from loan");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				customerBean e=new customerBean();
				e.setName(rs.getString("name"));
				e.setAccno(rs.getInt("accno"));
				e.setLoan_amount(rs.getDouble("loan_amount"));
				e.setLoan_date(rs.getString("loan_date"));
				list.add(e);
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public double  viewBalance(String uid) {
		
		 double balance=0;
		 try(Connection con=new DBOperation().start())
			{
				PreparedStatement ps=con.prepareStatement("select balance from customer where name=?");
				ps.setString(1, uid);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					balance =rs.getDouble("balance");
				}
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		return balance;
	}

}

