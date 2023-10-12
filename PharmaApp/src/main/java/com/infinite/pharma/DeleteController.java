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
public class DeleteController {
	@RequestMapping("/delete")
	public String insert(){
		return "delete";
	}
	Connection con = null;
	
	@RequestMapping(value="/deletevalues",method=RequestMethod.POST)
	public String delete(HttpServletRequest request, HttpServletResponse response)
	{
		String medno = request.getParameter("medno");//getting user values
		//getting connection to database 
		DataSource datasource = HikariCPTest.getDataSource();
		try {
			//statement to delete values
			con = datasource.getConnection();
			Connection con = DatabaseConnection.getDatabaseconnection();
			PreparedStatement ps = con.prepareStatement("delete from pharma where medno=? ;");
			ps.setString(1, medno);
			int x = ps.executeUpdate();
			if (x!=0) {
				//condition for user entered correct values in table or not
				return "Options";//redirecting to success page
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "invalid";
	}

	}

