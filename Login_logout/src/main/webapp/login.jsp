<%@page import="java.text.ListFormat.Style"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="loginstyle.css">
</head>

<body>
    <div class="container">
        <div class="welcome-section">
            <h1>Welcome Back</h1>
            <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
            <div class="social-icons">
                <a href="#"><i class="fab fa-facebook-f"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-instagram"></i></a>
                <a href="#"><i class="fab fa-youtube"></i></a>
            </div>
         
           <a class="btn-link" href="index.html">Home</a>
        </div>
        <div class="login-section">
            <h2>Login</h2>
            <form action="loginservlet" method="post">
                <div class="input-group">
                    <label for="username">Username</label>
                    <input type="text" id="email" name="username" required>
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <div class="remember-me">
                    <input type="checkbox" id="remember-me" name="remember-me">
                    <label for="remember-me">Remember Me</label>
                </div>
                <button type="submit" class="btn">Login now</button>
                <a href="#" class="forgot-password">Lost your password?</a>
                <p class="terms">
                    By clicking on "Login now" you agree to 
                    <a href="#">Terms of Service</a> | <a href="#">Privacy Policy</a>
                </p>
            </form>
        </div>
    </div>



<% String error=request.getParameter("error");
		if(error !=null && error.equals("1")) {	%>
		<p style="color:red;">Invalid username or password</p> 
		<% } %>
		
		<% String rs=request.getParameter("registration");
		if(rs!=null && rs.equals("success")){%>
			<p style="color:green;">Your Registertion is success</p>
		<% } %>



</body>
</html>