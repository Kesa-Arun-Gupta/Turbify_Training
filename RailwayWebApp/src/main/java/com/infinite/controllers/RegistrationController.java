package com.infinite.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.db.Hikari;


@Controller
public class RegistrationController {
	@RequestMapping("/register")
	public String display()
	{
		return "register";
	}
	
	@RequestMapping("/traindetails")
	public String display1()
	{
		return "traindetails";
	}
	
		
		Connection con = null;
		PreparedStatement ps=null;
		@RequestMapping(value="/registervalues",method=RequestMethod.POST)
		public String register(HttpServletRequest request,HttpServletResponse response){
			
			try {
				DataSource datasource = Hikari.getDataSource();
				con = datasource.getConnection();
				ps = con.prepareStatement("insert into register values(?,?,?,?,?,?);");
				ps.setString(1,request.getParameter("fn"));
				ps.setString(2,request.getParameter("ln"));
				ps.setString(3,request.getParameter("user"));
				ps.setString(4,request.getParameter("pass"));
				ps.setString(5,request.getParameter("add"));
				ps.setString(6,request.getParameter("mnum"));
				int x = ps.executeUpdate();
				if (x!=0) {                          //condition for inserting values into table				 
					return "index1";                //redirecting to inserted page
				}
			
		}
			catch (SQLException e)
			{
			e.printStackTrace();
			}
		    return "invalid";
		

		}
		
		
		}

