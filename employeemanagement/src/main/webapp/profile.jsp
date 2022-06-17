<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="header.jsp" %>
<body>
   <h4>Employee Profile</h4><hr>
    <table>
      <tr><td>Name</td><td>${emp.name}</td></tr>
       <tr><td>Email</td><td>${emp.email}</td></tr>
        <tr><td>Contact</td><td>${emp.contact}</td></tr>
         <tr><td>Salary</td><td>${emp.salary}</td></tr>
          <tr><td>Role</td><td>${emp.role}</td></tr>
           <tr><td>Address</td><td>${emp.address}</td></tr>
    </table>
    <a href="logout">Logout</a>
</body>
<%@include file="header.jsp" %>
</html>