<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>  
<%@page language="java" %>  
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="header.html" %>
</head>
<body>
    <!-- Scriplet -->
    <%
      Date d = new Date();
      out.println("Current Date and Time :"+d);
      float result = getDivision();
      out.println("Division Result :"+result);
    %>
    
    <!--Declarative tag-->
    <%!
       float a=10,b=30;
       public float getDivision(){
    	   return a/b;
       }
    %>
    <!-- Expression -->
    <p style="color:blue">Addition : <%=a+b%> </p>
    <p style="color:blue">Division Result : <%=getDivision()%> </p>
</body>
<%@include file="footer.html" %>
</html>