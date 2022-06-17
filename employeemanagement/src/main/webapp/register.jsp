<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="header.jsp" %>
<body>
   <form action="register" method="post">
      <table align="center">
        <tr><td>Name</td><td><input type="text" name="name"></td></tr>
        <tr><td>Password</td><td><input type="password" name="password"></td></tr>
        <tr><td>Email</td><td><input type="email" name="email"></td></tr>
        <tr><td>Contact</td><td><input type="text" name="contact"></td></tr>
        <tr><td>Salary</td><td><input type="text" name="salary"></td></tr>
        <tr><td>Gender</td><td><input type="radio" name="gender" value="male">Male<input type="radio" name="gender" value="female">Female</td></tr>
        <tr><td>Roles</td><td>
        <select name="role">
           <option value="employee">Employee</option>
           <option value="admin">Admin</option>
        </select>
        </td></tr>
        <tr><td>Address</td><td><input type="text" name="empaddress"></td></tr>
        <tr><td><input type="submit" value="Register"></td></tr>
      </table>
   </form>
</body>
<%@include file="footer.jsp" %>
</html>