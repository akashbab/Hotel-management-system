<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <title>Dashboard</title>
</head>
<body>
    <div class="container">
        <h2>Welcome, <%= session.getAttribute("user") != null ? ((com.bean.User) session.getAttribute("user")).getName() : "Guest" %>!</h2>
        <a href="reservation.jsp"><button>Book a Room</button></a>
        <a href="billing.jsp"><button>Billing</button></a>
        <a href="history.jsp"><button>Booking History</button></a>
        <a href="support.jsp"><button>Customer Support</button></a>
        <a href="index.jsp"><button>Logout</button></a>
    </div>
</body>
</html>