<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>

<body>
<div class="container">
<h1>Register</h1>
<form action="registerservlet" method="post">
<label for="username">Username:</label>
<input type="text" id="username" name="username" required><br>
<label for="email">Email:</label>
<input type="email" id="email" name="email" required><br>

<label for="password">Password:</label>
<input type="text" id="password" name="password" required><br>
<button type="sumbit">login</button>



</form>
<p ><a href="index.html">Back to home</a></p></div>
</body>
</html>--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration page</title>
    <link rel="stylesheet" href="loginstyle.css">
</head>
<body>
    <div class="container">
        <div class="welcome-section">
            <h1>Welcome</h1>
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
            <h2>Register Now</h2>
            <form action="registerservlet" method="post">
                <div class="input-group">
                    <label for="username">Username</label>
                    <input type="text" id="email" name="username" required>
                </div>
                <div class="input-group">
                    <label for="gmail">Email</label>
                    <input type="gmail" id="email" name="gmail" required>
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <div class="remember-me">
                    <input type="checkbox" id="remember-me" name="remember-me">
                    <label for="remember-me">Remember Me</label>
                </div>
                <button type="submit" class="btn">Register</button>
                
                <p class="terms">
                    By clicking on "Register" you agree to 
                    <a href="#">Terms of Service</a> | <a href="#">Privacy Policy</a>
                </p>
            </form>
        </div>
</div>

</body>
</html>


