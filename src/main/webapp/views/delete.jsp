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
	The product ${name} has been successfully deleted .
	
	<form action="/showAll" method="get">
		<br>
		<button type="submit">Afficher tout</button>
	</form>
</body>
</html>