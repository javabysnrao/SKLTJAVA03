<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %> 
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Employee Display Information</h3>
<hr>
Name :  ${name} <br>
Email :  ${email} <br>
Salary : ${salary} <br>
Contact : ${contact} <br>
<hr>
<h3>Employee Display Information</h3><hr>
<%
   List<String> list = (List<String>)request.getAttribute("list");
   for(String str:list){
	   out.println(str+"</br>");
   }
%>
</body> 
</html>