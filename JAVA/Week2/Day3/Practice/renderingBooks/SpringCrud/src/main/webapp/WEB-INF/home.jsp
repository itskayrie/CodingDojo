<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Title</th>
				<th>Language</th>
				<th>Description</th>
				<th>Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allBooks }" var="oneBook">
				<tr>
					<td><a href='/books/${oneBook.id }'> ${oneBook.title}</a></td>
					<td>${oneBook.language}</td>
					<td>${oneBook.description}</td>
					<td>${oneBook.numberOfPages}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>