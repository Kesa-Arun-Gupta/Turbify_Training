package com.infinite.pharma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.datasource.HikariCPTest;
import com.infinite.db.DatabaseConnection;
@Controller
public class InsertController {
	
	@RequestMapping("/insert")
	public String insert(){
		return "insert";
	}
	Connection con = null;
	
	@RequestMapping(value="/insertvalues",method=RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response){
		//System.out.println("dvgxbh");
		String medno=request.getParameter("medno");
		String medname=request.getParameter("medname");
		String expiry=request.getParameter("date");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int cost=Integer.parseInt(request.getParameter("cost"));
		//getting connection to database
		
		try {
			//statement to insert values
			DataSource datasource = HikariCPTest.getDataSource();
			con = datasource.getConnection();
			Connection con = DatabaseConnection.getDatabaseconnection();
			PreparedStatement ps = con.prepareStatement("insert into pharma values(?,?,?,?,?);");
			ps.setString(1,medno);
			ps.setString(2,medname);
			ps.setString(3,expiry);
			ps.setInt(4,quantity);
			ps.setInt(5,cost);
			int x = ps.executeUpdate();
			if (x!=0) {                          //condition for inserting values into table
				 
				return "Options";//redirecting to inserted page
			}
		
	}
		catch (SQLException e)
		{
		e.printStackTrace();
		}
	    return "invalid";
	

	}
}
