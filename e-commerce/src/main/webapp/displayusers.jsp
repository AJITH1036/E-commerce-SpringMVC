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

<%List<User> list=(List<User>)request.getAttribute("list");  %>
<table border="1">
<tr><th>Sno</th><th>Sname</th><th>Email</th></tr>
<% for(User u:list){%>
<tr><td><%=u.getId() %></td><td><%=u.getUsername() %></td> <td><%=u.getEmail() %></td></tr>
<%}%>
</table>

</body>
</html>