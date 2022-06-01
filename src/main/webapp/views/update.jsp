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

<title>Adding a new person</title>
</head>
<body>
<div style="width: 40%; margin-left: 100px;margin-top: 50px">
	<h2>Adding a new person</h2>
	<form action="/update" method="post">
		<input type="hidden" name="id" value="${id}"> <br>
		 Nom du produit :<input type="text" name="name" class="form-control" value="${ name }"><br>	 
		 Prix: <input type="text" class="form-control" name="prix" value="${ prix }">
		 <br>
		<button type="submit" class="btn btn-primary">Envoyer</button>
	</form>
	</div>
</body>
</html>