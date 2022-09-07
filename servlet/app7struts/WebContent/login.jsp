<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SunLife customer app login page</title>
</head>
<body>
<div style="color:red">
    	<html:errors />
   </div>
    <html:form action="/login" >
       		 User Name :<html:text name="LoginForm" property="username" /><br/>
        	Password  :<html:password name="LoginForm" property="password" /><br/>
        	<html:submit value="Login" />
   	 </html:form>
</body>
</html>