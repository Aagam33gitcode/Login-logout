
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<link href="wlc.css" rel="stylesheet">
<body>
<% HttpSession session1=request.getSession(false);
if(session1 !=null && session1.getAttribute("username") !=null){
	
	
	String username=(String) session1.getAttribute("username");  
	  

%>
<div class="container">
<h1>Welcome,! <%= username %></h1>
<a href="logOut" class=wlc-logout>LOG-OUT</a>
</div></div>
<%
}else{
	response.sendRedirect("welcome.jsp");
}
%>

</body>
</html>