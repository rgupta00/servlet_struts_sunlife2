<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>your book suggestion</title>
</head>
<body>
<%
	List<String> books= (List<String>)request.getAttribute("books");

	for(String book: books){
		out.print(book+"<br/>");
	}
%>
<a href="bookselection.html">want new suggestions</a>
</body>
</html>