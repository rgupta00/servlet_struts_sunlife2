<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 int sum=(Integer)session.getAttribute("sum");
 out.print(sum);
%>
<a href="cal.jsp">want to add more numbers?</a>
</body>
</html>