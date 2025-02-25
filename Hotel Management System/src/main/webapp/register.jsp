<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
    <script src="validation.js"></script>
</head>
<body>
    <div class="container">
        <h2>Register</h2>
        <form action="MainServlet" method="post" onsubmit="return validateRegistration()">
            <input type="hidden" name="action" value="register">
            <label>Name:</label> <input type="text" id="name" name="name" required><br>
            <label>Email:</label> <input type="email" id="email" name="email" required><br>
            <label>Username:</label> <input type="text" id="username" name="username" required><br>
            <label>Password:</label> <input type="password" id="password" name="password" required><br>
            <label>Confirm Password:</label> <input type="password" id="confirmPassword" required><br>
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>