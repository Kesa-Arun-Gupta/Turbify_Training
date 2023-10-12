<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<style>
body {
  background-image: url('data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBwcHBwgHBwcHBwoHBwcHBw8ICQcKIBEiIiARHx8YHSggGBolGx8VITEhJSkrLi4uFx8zODMsNygtLisBCgoKDQ0NDw0NDysZFRkrLSsrKys3KysrKysrKysrKysrKzc3KysrKysrKysrKysrKysrKysrKysrKysrKysrK//AABEIAOEA4QMBIgACEQEDEQH/xAAZAAEBAQEBAQAAAAAAAAAAAAABAAIEAwf/xAAZEAEBAQEBAQAAAAAAAAAAAAAAARESAmH/xAAXAQEBAQEAAAAAAAAAAAAAAAAAAQIE/8QAFhEBAQEAAAAAAAAAAAAAAAAAABES/9oADAMBAAIRAxEAPwD6sklcqSQJJAkiARQJIgEUARQBEAEUARAJJAkkCSQJJAkkCSQIpAkUCRQoJQDFhQDFhQDA0gZRWAyihACgCSBJIEkgSSBFEEkQRRFBwoAcOLBRiaxAymlgM4GsQMhrEIyGgDKIECIAJIEkgRSApEEURUUYKjiw4KMOHFgDFjWLAZWNYsBnBjeDAZwNAGQ0BGQ0BGUQIAUASQEggYRCKSoRVCjBU0iKDhOIDFhWCjFjWAGQ3gEZDQqjLLbNEZoaoEZDTIgBAiSQGGAwCYDBTGoIYKYYoYKTBGkVFEUEoUIoGQ0BGRWqzRGaGqKqM1lqiiM0NVmiAECBJATAQMajMagphgjUFMMEMGmoYIYilqMxqCoqIEkgFBooM0EURmimiqgrNarNGRWa1WaIKDQARQiIMAwwGCtQwQwVqGMtQVqGMwxFahZIrRZOikIAhUhACyIKKWaqKs00UQVmmgQUECBJAoYCDRZMFahjLQrUMZhFahZhRWiyRWkzp0Cho0CEAVCAioqFVBRSKIKEBFRUBEkgRZIGNMkVoxkg0WSK0WUK3q1nToNatZ1IrWrWdWgdWjRqoQgCCAiCAiCAIJCIJAiEBIQNFkitJkg1pZQrerWVoNadZQNDQgOoaAOhaAICEQQBBIRBIEkgSSBEICQgJZINJk6K1q1lA0tC0DqGoDq0AChoAhIRBIEEgSSBJIEThwGcWN4ZBYxyeW5GpAjz5XD1kMgseXC4e/JnkXLw4XDonk8oZc/C4dPK4Fy5uPi4dPC5DLl4XDp5HImXPwOHRfI5Ujn4XL3sZwSPHkcvawWCR44selgsCMBvAIyigWnWUDetSvNaFeumV46eha9p6anpz9HsWujo9Oftdhp09nty9nsXTp7Pbl7XYadXY7c3a7DTp7HTn7XYae/Q6eHa7E09r6Zvp5droK9LRrz6GiV6aNY1aJWtGsoDqCBJIEkgSSBJIEkgRiQJJAkkASQJJAkkCSQJJAkkCSQP/9k=');
}
</style>
	<center>
		<form method="post" action="registervalues">
			<br>
			<br> First Name <input type="text" placeholder="Enter your Firstname" name="fn">    Last Name <input type="text" placeholder="Enter your Lastname" name="ln"> <br>			
			<br> UserName <input type="text" placeholder="Username" name="user"> <br>
			<br> Password <input type="password" placeholder="Enter Password" name="pass"> <br>
			<br> Address <textarea rows="5" cols="20" placeholder="Enter Address" name="add"></textarea> <br>
			<br> Mobile Number <input type="text" placeholder="Enter Mobile Number" name="mnum"> <br>
			<br> <input type="submit" value="Register">
		</form>
	</center>
</body>
</html>