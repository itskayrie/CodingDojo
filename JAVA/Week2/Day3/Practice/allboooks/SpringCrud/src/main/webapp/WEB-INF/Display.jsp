<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	   <h1> Create a Book </h1>
    <form action="/books/processBook" method="POST">
    Title: <input name="title"> <br>
    Language: <input name="language"> <br>
    Description: <input name="description"> <br>
    # of pages: <input name="numOfPages"> <br>
    <button>Create</button>
    </form>
</body>
</html>