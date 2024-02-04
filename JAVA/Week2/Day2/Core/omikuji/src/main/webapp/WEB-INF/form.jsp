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
<h1>omikuji form </h1>
<form action="/processForm" method="post">
<label for ="numofyears">Pick any number from 5 to 25</label>
<input type="number" name="numofyears"/>
<label for="city" >Enter the name of any city:</label>
<input name="city"/>
<label for="person" >Enter the name of any person:</label>
<input name="person"/>
<label for="hobby" >Enter the name of any real person:</label>
<input name="hobby"/>
<label for="thing">Enter any type of living thing:</label>
<input name="thing"/>
<label for="nice">Say something nice to someone :</label>
<input name="nice"/>
  <button type="submit" >Send</button>
</form>
</body>
</html>