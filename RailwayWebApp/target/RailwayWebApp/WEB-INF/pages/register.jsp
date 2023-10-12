<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<center>
		<form method="post" action="registervalues">
			<br>
			<br> First Name <input type="text" name="fn">    Last Name <input type="text" name="ln"> <br>			
			<br> UserName <input type="text" name="user"> <br>
			<br> Password <input type="password" name="pass"> <br>
			<br> Address <textarea rows="5" cols="10" name="add"></textarea> <br>
			<br> Mobile Number <input type="text" name="mnum"> <br>
			<br> <input type="submit" value="Register">
		</form>
	</center>
</body>
</html>