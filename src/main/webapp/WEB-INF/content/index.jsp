<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Hello I'm from Jsp index</p>
<%
	String variable = (String) request.getAttribute("var");
	out.println(variable);
%>

</body>
</html>