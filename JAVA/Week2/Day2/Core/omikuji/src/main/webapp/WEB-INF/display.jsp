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
	<div >
		<h1 >Here is your Omikuji!</h1>
		<div >
   			<h3 >In <span>${keyYear }</span> years.You will leave in <span>${keyCity}</span> with <span>${keyPerson }</span> as your roommate, <span>${keyHobby}</span> for a living. The next time you see a <span>${keyThing }</span>,you will have good luck. Also, <span>${keyNice }</span> </h3>
   			<a href="/form" >Go Back</a>
		</div>
	</div>
</body>
</html>