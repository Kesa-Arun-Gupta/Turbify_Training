<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<style>
body {
  background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdUyaho1JaZ14yfQ2ia1I-admeea34RA9Yjw&usqp=CAU');
}
</style>
<center>
<h2>Welcome to the INDIAN RAILWAY ENQUIRY</h2>
<br><br>
<br><br>
		<form method="post" action="login">
			<br>
			<br> UserName <input type="text" placeholder="Username" name="user"> <br>
			<br> Password <input type="password" placeholder="Password" name="pass"> <br>			
			<br> <input type="submit" value="Login">&nbsp &nbsp  <input type="reset" value="Reset"><br><br>
		</form>
		 <form method="post" action ="register">
		 <input type="submit" value="Register"></form>
	</center>
</body>
</html>