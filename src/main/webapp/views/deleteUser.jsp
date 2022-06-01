<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	The user ${username} has been successfully deleted .
	
	<form action="/showAllUsers" method="get">
		<br>
		<button type="submit">Go Back</button>
	</form>
</body>
</html>