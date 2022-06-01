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
<body>
<div style="width: 60%; margin-left: 100px;margin-top: 50px">
	<h1>Welcome</h1>
	The Category named ${ name } has been successfully added.
	<form action="showAllCat" method="get">
		<br>
		<button type="submit" class="btn btn-primary">Show All Categories</button>
	</form>
</div>
</body>
</html>