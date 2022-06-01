<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div style="width: 60%; margin-left: 100px;margin-top: 50px">
	<h1>List of Users</h1>
	

	<table class="table">
  <thead>
    <tr>
      
      <th scope="col"> Userame</th>
       <th scope="col">Password</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
	<c:forEach items="${utilisateurs}" var="user">
		<tbody>
			<tr>
				<td> <c:out value="${user.username }"></c:out></td>
				<td> <c:out value="${user.password }"></c:out></td>
				<td> <a href="${pageContext.request.contextPath}/deleteUser/${user.id}"> delete</a>   &nbsp &nbsp &nbsp &nbsp   <a href="${pageContext.request.contextPath}/updateUser/${user.id}">update</a></td>
			</tr>
			
		</tbody>
			
		
	</c:forEach>
</table>

	
	<form action="/addUser" method="get">
		<br>
		<button type="submit" class="btn btn-primary"> Create User </button>
	</form>
	</div>
</body>
</html>