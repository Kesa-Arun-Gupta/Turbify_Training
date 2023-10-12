<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.infinite.db.Hikari"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<Style>
body {text-align:center;}
</Style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table, th, td {
  border: 1px solid black;
}
table.center {
  margin-left: 200px;
  margin-right: 400px;
}
</style>
<title>Trains Page</title>
</head>
<body>
<%@include file="trainsearch.jsp" %>
<br>
<form  action="index1"><input type="submit"  value="Logout"></form></left>
<% 
ResultSet rs=null;
Connection con=null;
response.setContentType("text/html");
PrintWriter ou=response.getWriter();
String source = request.getParameter("tsource");
String destination = request.getParameter("tdestination");
DataSource datasource=Hikari.getDataSource();
con=datasource.getConnection();
PreparedStatement ps=con.prepareStatement("select * from train where tsource=? and tdestination=?;");
ps.setString(1,source);
ps.setString(2,destination);
rs = ps.executeQuery();
out.println("<html><body><center><h3>Displaying Train Details</h3></center><br><br></body></html");
while(rs.next()){
	out.println("<html><body><center><table><tr><th>Train Number</th><th>Train Name</th><th>Source</th><th>Destination</th><th>Time</th></tr><tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr></center><br></body></html>");
}
%>
</body>
</html>