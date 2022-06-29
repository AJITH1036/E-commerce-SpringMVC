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
<%List<Orderdetails> list=(List<Orderdetails>)request.getAttribute("list"); %>
<%List<Product> list1=(List<Product>)request.getAttribute("list"); %>
<%List<User> list2=(List<User>)request.getAttribute("list"); %>

<table border="1">
<%for(Orderdetails or:list){ %>
<%for(Product p:list1){ %>
<%for(User u:list2){ %>
<tr><th> ID </th><th>Product code</th><th> product name</th><th>price</th><th>Customer name</th></tr>
<tr><td><%=or.getId() %></td><td><%=p.getCode() %></td><td><%=p.getName()%></td><td><%=p.getPrice() %></td><td><%=u.getUsername() %></td></tr>
<%} %>
<%} %>
<%} %>

</table>
</body>
</html>