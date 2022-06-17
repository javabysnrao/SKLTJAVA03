<html>
<%@page isELIgnored="false"%>
<head>
<title>Employee Management</title>
</head>
<%@include file="header.jsp" %>
<body>
   <h5 style="color: red">${msg}</h5>
   <form action="login" method="post">
       <table align="center">
         <tr><td>Email</td><td><input type="text" name="email"></td></tr>
         <tr><td>Password</td><td><input type="password" name="password"></td></tr>
         <tr><td><input type="submit" value="Login"></td></tr>
       </table>
       <a href="pagenavigation?page=register">New Registration</a>
   </form>
</body>
<%@include file="footer.jsp" %>
</html>
