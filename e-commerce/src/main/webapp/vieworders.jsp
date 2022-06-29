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
<%List<Orders> list=(List<Orders>)request.getAttribute("list");  %>
<table border="1">
<tr><th>Order Id</th><th>Addressline1</th><th>Addressline2</th><th>City</th><th>Pin code</th><th>Phone No</th></tr>
<%for(Orders o:list) {%>
<tr>
<td><%=o.getId() %></td>
<td><%=o.getAddressline1() %></td>
<td><%=o.getAddressline2() %></td>
<td><%=o.getCity() %></td>
<td><%=o.getPincode() %></td>
<td><%=o.getPhoneno() %></td>
</tr>
<%} %>
</table>
</body>
</html>