<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Billing</title>
</head>
<body>
    <div class="container">
        <h2>Billing Information</h2>
        <p>Total Amount: $XXX</p>
        <form action="MainServlet" method="post">
            <input type="hidden" name="action" value="processPayment">
            <label>Payment Method:</label>
            <select name="paymentMethod">
                <option value="Credit Card">Credit Card</option>
                <option value="Debit Card">Debit Card</option>
            </select><br>
            <button type="submit">Pay Now</button>
        </form>
    </div>
</body>
</html>