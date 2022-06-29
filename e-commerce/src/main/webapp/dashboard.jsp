<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin dash board</title>
</head>
<body>
<h1>Welcome Admin!</h1>

<a href="addproduct.jsp">Add products</a><br><br>
<form action="displayproduct">
<input type="submit" value="view products">
</form><br><br>
<form action="displayusers">
<input type="submit" value="view users">
</form><br><br>

<a href="admlogout.jsp">logout</a><br><br>
<a href="pwchange.jsp">change password</a>
</body>
</html>