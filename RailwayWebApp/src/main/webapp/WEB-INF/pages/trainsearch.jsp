<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Page</title>
</head>
<style>
body {
  background-image: url('https://img.freepik.com/free-photo/abstract-blur-empty-green-gradient-studio-well-use-as-background-website-template-frame-business-report_1258-52616.jpg');
}
</style>
<form  action="index1"><input type="submit"  value="Logout"></form></left>
<form action="trainlist" method="post">
<h3> Search your Train here</h3>
Enter Station From <select name="tsource">
<option>Enter the station from</option>
 <option value="visakhapatnam">Visakhapatnam</option>
  <option value="secunderabad">Secunderabad</option>
  <option value="tirupati">Tirupati</option>
</select>&nbsp &nbsp&nbsp &nbsp
Enter Destination <select name="tdestination">
<option>Enter the Destination station</option>
 <option value="visakhapatnam">Visakhapatnam</option>
  <option value="secunderabad">Secunderabad</option>
  <option value="tirupati">Tirupati</option>
</select>
<br><br>
<input type="submit" value="search">
</form>
</body>
</html>