<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<h1>Fruits List</h1>
	<ul>
	<c:forEach items="${fruitsList }" var="OneFruit">
	<li> <c:out  value="${oneFruit.name }"/></li>
	</c:forEach>
	</ul>
</body>
</html>