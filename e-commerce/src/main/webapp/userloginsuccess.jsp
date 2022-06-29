<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.*" %>

<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>welcome to Sport shoes</h1>
<form action="displayproductuser">
<input type="submit" value="view products"><br><br>
</form>

<jsp:include page="showcategory.jsp"></jsp:include>

<jsp:include page="searchproduct.jsp"></jsp:include>

<a href="userlogout.jsp">Logout</a>

</body>
</html>