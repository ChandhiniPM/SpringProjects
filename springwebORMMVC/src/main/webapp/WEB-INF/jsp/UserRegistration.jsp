<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<pre>
	<form action="RegistrationPage" method="POST">
		ID:<input type="text" name="id"> 
		NAME:<input type="text" name="name">
		EMAIL:<input type="text" name="email">
		 <input type="submit">
	</form>
	
	</pre>
	${Result}
</body>
</html>