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
<title>Train Details Page</title>
</head>
<body>

 

<% 
Connection con=null;
response.setContentType("text/html");
PrintWriter ou=response.getWriter();
DataSource datasource=Hikari.getDataSource();
con=datasource.getConnection();
PreparedStatement ps=con.prepareStatement("Select *from train where tnum=?;"); 
ResultSet rs=ps.executeQuery();
out.println("<html><body>Displaying Train Details<br><br></body></html");
while(rs.next()){
	int i=1;
	out.println("<html><body>"+rs.getString(i++)+"<br></body></html>");
}
%>

</body>
</html>