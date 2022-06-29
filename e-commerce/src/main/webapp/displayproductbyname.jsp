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
<%List<Product>list=(List<Product>)request.getAttribute("list"); %>
<table border="1">
<tr>
<th>code</th><th>Product name</th><th>Size</th><th>Gender</th><th>Category</th><th>Price</th>
</tr>
<% for(Product p:list){%>
<tr>
<td><%=p.getCode() %></td><td><%=p.getName() %></td><td><%=p.getCategory() %></td><td><%=p.getSize() %></td><td><%=p.getPrice() %></td>
</tr>
<%} %>
</table>
</body>
</html>