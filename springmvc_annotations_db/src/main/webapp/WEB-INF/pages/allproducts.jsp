<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>All Products</h3><hr>
   <table border="1">
      <tr><td style="display: none"></td><td>Name</td><td>Qty</td><td>Price</td><td>Desc</td></tr>
      <c:forEach var="p" items="${allproducts}">
         <tr><td style="display: none">${p.id}</td><td>${p.name}</td><td>${p.qty}</td><td>${p.price}</td><td>${p.desc}</td></tr>
      </c:forEach>
   </table>
   <a href="index.jsp">Add More Products..</a>
</body>
</html>