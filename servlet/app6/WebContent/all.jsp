<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customers information page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


<table class="table table-striped">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${customers}" var="customer">
		  <tr>
				<td><c:out value="${customer.id }"/></td>
				<td><c:out value="${customer.name }"/></td>
				<td><c:out value="${customer.address }"/></td>
				<td><c:out value="${customer.phone }"/></td>
				<td><c:out value="${customer.insuranceno }"/></td>
			</tr>
		</c:forEach>
			
		
		</tbody>
	</table>
	
</body>
</html>