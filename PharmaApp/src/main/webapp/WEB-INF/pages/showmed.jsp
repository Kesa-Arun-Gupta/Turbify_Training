<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.infinite.datasource.HikariCPTest"%>
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
<title>Insert or Delete</title>
</head>
<body>
<h3>Your Requested Modifications are Done</h3>
 

<% 
Connection con=null;
response.setContentType("text/html");
PrintWriter ou=response.getWriter();
DataSource datasource=HikariCPTest.getDataSource();
con=datasource.getConnection();
String medno = request.getParameter("medno");
PreparedStatement ps=con.prepareStatement("Select *from pharma where medno=?;");
ps.setString(1, medno);
ResultSet rs=ps.executeQuery();
out.println("<html><body>Displaying Record<br><br></body></html");
while(rs.next()){
	//int i=1;
	out.println("<html><body>"+rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getInt(4)+","+rs.getInt(5)+"<br></body></html>");
}
%>

</body>
</html>