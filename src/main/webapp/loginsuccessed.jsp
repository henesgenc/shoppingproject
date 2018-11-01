<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String username = request.getParameter("username");
%>
<p><%= username %> </p>
Login Successed.
<a href="./index.jsp">Anasayfa</a>
</body>
</html>