<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="margin: 100px;">
	<h2>Adding a new User</h2>
	
	<div style="width: 40%">
	
	
	<form action="addUser" method="post">
		<br> Username : <input type="text" class="form-control" name="username"><br> 
		Password: <input type="password" class="form-control" name="password"> <br>
		<button type="submit" class="btn btn-primary">Envoyer</button>
	</form>
	</div>
</body>
</html>