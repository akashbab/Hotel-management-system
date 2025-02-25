<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="MainServlet" method="post">
            <input type="hidden" name="action" value="login">
            <label>Username:</label> <input type="text" name="username" required><br>
            <label>Password:</label> <input type="password" name="password" required><br>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>