<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="header.jsp" %>
<body>
  <h3>All Employees</h3><hr>
  <table>
    <tr><td>Name</td><td>Email</td><td>Contact</td><td>Salary</td><td>Role</td><td>Address</td><td>Action</td></tr>
    <c:forEach items="${allemps}" var="e">
        <tr><td>${e.name}</td><td>${e.email}</td><td>${e.contact}</td><td>${e.salary}</td><td>${e.role}</td><td>${e.address}</td><td><a href="update">Update</a>&nbsp;&nbsp;&nbsp;<a href="delete?empid=${e.empId}">Delete</a></td></tr>
    </c:forEach>
  </table>  
  <a href="logout">Logout</a>
</body>
<%@include file="footer.jsp" %>
</html>