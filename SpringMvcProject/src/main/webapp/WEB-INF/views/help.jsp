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
String message=(String) request.getAttribute("info");
%>
<font face='Lucida Handwriting' color='Red' size='36'>
<%=message %>
</font>
</body>
</html>