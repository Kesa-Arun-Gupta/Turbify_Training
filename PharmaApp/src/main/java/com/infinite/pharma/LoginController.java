package com.infinite.pharma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infinite.datasource.HikariCPTest;
import com.infinite.db.DatabaseConnection;
@Controller
public class LoginController {
	Connection con = null;
	
	@RequestMapping("/loginvalues")
	public String login(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			DataSource datasource = HikariCPTest.getDataSource();
			//System.out.println("hii");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			con = datasource.getConnection();
			//Connection con = DatabaseConnection.getDatabaseconnection();
			PreparedStatement ps = con.prepareStatement("select * from login where username=?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			//System.out.print("y");
			while (rs.next()) 
			{
				if (rs.getString(1).equals(username)) 
				{
					//System.out.print("e");
					if (rs.getString(2).equals(password)) 
					{
						return "Options";
					}
					else 
					{
						return "invalid";
					}
				} 
				else 
				{
					return "invalid";
				}
			}
		} 
		catch (SQLException e)
		{
			System.out.println(e);
		}
		catch (Exception e1) 
		{
			System.out.println(e1);
		}
		return "invalid";

	}
}

