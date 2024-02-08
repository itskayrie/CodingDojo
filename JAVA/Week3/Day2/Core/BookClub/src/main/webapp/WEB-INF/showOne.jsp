
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One Book</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container p-5 mt-5">
<div class="d-flex justify-content-between align-items-center">
	<h1 class="text-uppercase text-center m-3 p-3 ">${Book.title}</h1>
	<a href="/books" class="btn btn-outline-dark">Back to shelves</a>
</div>
<h3 class="m-3"><span class="text-capitalize text-primary">${Book.user.userName}</span> read <span class="text-primary text-capitalize text-opacity-50">${Book.title}</span> by <span class="text-capitalize text-info">${Book.author}</span></h3>
<p>Here are ${Book.user.userName}'s thoughts:</p>
<div class="border-top border-bottom border-info p-5 m-3">
    ${Book.myThoughts}
</div>

<c:if test="${user.userName.equals(Book.user.userName)}">
<div class="d-flex justify-content-end align-items-center gap-3 m-3">
	<a href="/books/edit/${Book.id}" class="col-2 btn btn-dark  ">Edit</a>
	<form class="col-2" action="/books/delete/${Book.id}" method="POST"><input type="hidden" name="_method" value="delete"><input type="submit" value="Delete" class="col-11  btn btn-outline-danger" /></form>
</div>
</c:if>

</div>
</body>
</html>