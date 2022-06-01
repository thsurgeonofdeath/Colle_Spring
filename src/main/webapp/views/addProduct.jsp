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

<title>Adding a new product</title>
</head>
<body style="margin: 100px;">
	<h2>Adding a new Product</h2>
	
<!-- 	
<form action="addProduct" method="post" style="width: 30%">
  <div class="form-group">
    <label for="exampleInputEmail1">Nom du produit </label>
    <input type="text" name="name" class="form-control"  >
  
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">Prix </label>
    <input type="text" name="prix" class="form-control" " >
   
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form> -->
	
	
	
	<div style="width: 40%">
	
	
	<form action="addProduct" method="post">
		<br> Name : <input type="text" class="form-control" name="name"><br> Prix
		: <input type="text" class="form-control" name="prix"> <br>
		<button type="submit" class="btn btn-primary">Envoyer</button>
	</form>
	</div>
</body>
</html>