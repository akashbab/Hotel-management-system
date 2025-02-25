<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Room Reservation</title>
</head>
<body>
    <div class="container">
        <h2>Book a Room</h2>
        <form action="MainServlet" method="post">
            <input type="hidden" name="action" value="bookRoom">
            <label>Check-in Date:</label> <input type="date" name="checkInDate" required><br>
            <label>Check-out Date:</label> <input type="date" name="checkOutDate" required><br>
            <label>Room Type:</label> <select name="roomType">
                <option value="Single">Single</option>
                <option value="Double">Double</option>
                <option value="Suite">Suite</option>
            </select><br>
            <button type="submit">Book Now</button>
        </form>
    </div>
</body>
</html>