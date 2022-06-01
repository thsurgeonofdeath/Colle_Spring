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
			<div class="btn-group-vertical">
			<form action="/addProduct">
			  <button class="btn btn-danger">Add Categories</button><br><br>
			 </form>
			 <form action="/addProduct">
			  <button class="btn btn-info">Add Products</button><br><br>
			  </form>
			  <form action="/addUser">
			  <button class="btn btn-warning">Add Users</button><br><br>
			  </form>
			</div>
</body>
</html>